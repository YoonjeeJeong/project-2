package ver03;
import java.util.InputMismatchException;
import java.util.Scanner;
import ver03.Account;

public class AccountManager implements MenuChoice, CustomSpecialRate{ 

	private Account[] accountArr;
	private int numofAcc;
	
	public AccountManager(int num) {
		accountArr = new Account[num];
		numofAcc = 0;

	}
	public void showMenu() throws MenuSelectException{
		
		int select;
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {
		
			System.out.println("1. 신규 계좌개설");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("4. 전체계좌정보 출력");
			System.out.println("5. 프로그램 종료");	
			select = scan.nextInt();
			scan.nextLine();//버퍼 날리기
			
			if(select>5 || select<1) {
				MenuSelectException MenuSE = new MenuSelectException();
				throw MenuSE;
			}
			
			switch(select) {
			case MAKE://데이터 입력
				makeAccount();
				break;
			case DEPOSIT://테이터 검색
				depositMoney();
				break;
			case WITHDRAW://데이터 삭제
				withdrawMoney();
				break;
			case INQUIRE://주소록 출력
				showAccInfo();
				break;
			case EXIT://프로그램 종료
				System.out.println("프로그램 종료");
				return;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("1-5사이의 수만 입력하세요");
				scan.nextLine();
		}
	}
}	
	public void makeAccount() {
		Scanner scan = new Scanner(System.in);
		
		int choice;
		String name, account;
		int money, interest;
		String credit_level;
		
		System.out.println("1.일반계좌 2.신용신뢰계좌");
		choice = scan.nextInt();
		scan.nextLine();
		
		if(choice==1) {
			System.out.println("계좌번호를 입력하세요: ");
			account = scan.nextLine();
			
			System.out.println("이름을 입력하세요: ");
			name = scan.nextLine();
			
			System.out.println("현재 잔액: ");
			money = scan.nextInt();
			
			System.out.println("이자");
			interest = scan.nextInt();
			scan.nextLine();
			
			System.out.println("계좌개설 완료");
	
			NormalAccount normalacc = 
					new NormalAccount(account, name, money, interest);
			accountArr[numofAcc++] = normalacc;		
		}
		else if(choice==2){
			System.out.println("계좌번호를 입력하세요: ");
			account = scan.nextLine();
			
			System.out.println("이름을 입력하세요: ");
			name = scan.nextLine();
			
			System.out.println("현재 잔액: ");
			money = scan.nextInt();
			
			System.out.println("이자: ");
			interest = scan.nextInt();
			scan.nextLine();
			
			System.out.println("신용등급: ");
			credit_level = scan.nextLine();
			
			HighCreditAccount accountH = 
					new HighCreditAccount(account, name, money, interest, credit_level);
			accountArr[numofAcc++] = accountH;
			
			}
		}
	public void depositMoney() {
		Scanner scan = new Scanner(System.in);
		String accountNum;
		int moneyIn;
		
		System.out.println("계좌번호를 입력하세요");
		accountNum = scan.nextLine();
		
		System.out.println("입금할 금액을 넣어주세요");
		moneyIn = scan.nextInt();
		for(int i=0 ; i<numofAcc ; i++) {
			if(accountNum.compareTo(accountArr[i].account)==0) {
				accountArr[i].money=accountArr[i].money+moneyIn;
			}
		}
		System.out.println("입금 완료");
	}
	public void withdrawMoney() {
		Scanner scan = new Scanner(System.in);
		String accountNum;
		int moneyOut;
		
		System.out.println("계좌번호를 입력하세요");
		accountNum = scan.nextLine();
		
		System.out.println("출금할 금액을 입력하세요");
		moneyOut = scan.nextInt(); 
		for(int i=0; i<numofAcc ; i++) {
			if(accountNum.compareTo(accountArr[i].account)==0) {
				accountArr[i].money=accountArr[i].money-moneyOut;
			}
		}
		System.out.println("출금 완료");
	
	}
	public void showAccInfo() {
		for(int i=0; i<numofAcc ;i++) {
			accountArr[i].showAccInfo();
		}
	}
}
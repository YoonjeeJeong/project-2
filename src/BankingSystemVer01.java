import java.util.Scanner;

import ver01.Account;
import ver01.MenuChoice;

public class BankingSystemVer01 implements MenuChoice {
	
	public static void printMenu() {
		
		System.out.println("1. 계좌개설");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 전체계좌정보 출력");
		System.out.println("5. 프로그램 종료");		
	}
	public static void main(String[] args) {
		
		Account acc = new Account(50);
		
			while(true) {
				
				printMenu();
				
				System.out.println("메뉴를 선택하세요");
				Scanner scan = new Scanner(System.in);
				int num = scan.nextInt();
				scan.nextLine();
				
				switch(num) {
				case MAKE://데이터 입력
					acc.makeAccount();
					break;
				case DEPOSIT://테이터 검색
					acc.depositMoney();
					break;
				case WITHDRAW://데이터 삭제
					acc.withdrawMoney();
					break;
				case INQUIRE://주소록 출력
					acc.showAccInfo();
					break;
				case EXIT://프로그램 종료
					System.out.println("프로그램 종료");
					return;
				}
			}
		
	}	

}

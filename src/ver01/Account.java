package ver01;

import java.util.Scanner;

public class Account implements MenuChoice{

	String account;
	String name;
	int balance;
	int money;
	
	public Account(String account, String name, int balance) {
		super();
		this.account = account;
		this.name = name;
		this.balance = balance;
	}
	
	
	private Account[] accountArr;
	private int numofAcc;
	
	public Account (int num) {
		accountArr = new Account[num];
		numofAcc = 0;
	}
	public void makeAccount() {
		Scanner scan = new Scanner(System.in);
		String account, name;
		int balance = 0;
	
		System.out.println("계좌번호를 입력하세요: ");
		account = scan.nextLine();
		System.out.println("이름을 입력하세요: ");
		name = scan.nextLine();
		System.out.println("첫 입금을 하세요");
		balance = scan.nextInt();
			if(balance==0) {
				System.out.println("입금 없음");
			}
		Account accountarr = new Account(account, name, balance);
		accountArr[numofAcc++] = accountarr;		
	}	
	public void depositMoney() {
		Scanner scan = new Scanner(System.in);
		money = scan.nextInt();
		balance +=money;
		scan.nextLine();
		System.out.println(money+"원 입금");
		System.out.println("잔액: "+balance);
	}
	public void withdrawMoney() {
		Scanner scan = new Scanner(System.in);
		balance = scan.nextInt(); 
		if(balance>=money) {
			balance -=money;
			System.out.println(money+"원 출금되었습니다");
			System.out.println("\n잔액: "+balance);
		}
	}
	public void showAccInfo() {
		for(int i=0; i<numofAcc ;i++) {
			System.out.println("계좌주: "+accountArr[i].name);
			System.out.println("계좌번호: "+accountArr[i].account);
			System.out.println("잔액"+accountArr[i].balance+"원");
		}
	}
}

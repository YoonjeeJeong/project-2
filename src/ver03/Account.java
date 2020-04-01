package ver03;

public abstract class Account implements MenuChoice{

	String account;
	String name;
	int money;
	
	public Account(String account, String name, int balance) {
		this.account = account;
		this.name = name;
		this.money = money;
	}
	public void showAccInfo() {
		System.out.println("계좌주: \n"+name);
		System.out.println("계좌번호: \n"+account);
		System.out.println("잔액: "+money+"원");
	}	
	public int interestRate(int _money) {
		return _money;

	}
}

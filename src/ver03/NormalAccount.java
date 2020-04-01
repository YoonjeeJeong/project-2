package ver03;

public class NormalAccount extends Account{
	
	int interest;
	
	public NormalAccount(String account, String name, int money, int interest) {
		super(account, name, money);
		this.interest = interest;
	}
	@Override
	public void showAccInfo() {
		super.showAccInfo();
		System.out.println("이자: "+interest+"%");
	}
	@Override
	public int interestRate(int _money) {
		return money = money+(money*interest/100)+_money;
	}

}

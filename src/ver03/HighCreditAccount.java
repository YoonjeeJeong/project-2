package ver03;

public class HighCreditAccount extends Account implements CustomSpecialRate{

	int interest;
	String credit_level;
	
	public HighCreditAccount(String account, String name, 
							int money, int interest, String credit_level) {
		super(account, name, money);
		this.interest = interest;
		this.credit_level = credit_level;
	}
	@Override
	public void showAccInfo() {
		super.showAccInfo();
		System.out.println("이자: "+interest+"%");
		System.out.println("신용등급: "+credit_level);
	}
	@Override
	public int interestRate(int _money) {
		
		int credit_level=0;
		
		switch(credit_level) {
			case A:
				credit_level=A;
				break;
			case B:
				credit_level=B;
			case C:
				credit_level=C;
				break;
		}
		return money = money+(money*interest/100)+(money*credit_level/100)+_money;
	}
	
}

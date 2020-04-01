import ver02.Account;
import ver02.AccountManager;
import ver03.MenuSelectException;

public class BankingSystemVer03{
	
	public static void main(String[] args) throws MenuSelectException{
		
		AccountManager accountMng = new AccountManager(50);
			accountMng.showMenu();
		
	}	

}

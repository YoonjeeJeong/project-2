package ver03;

import java.util.InputMismatchException;

public class MenuSelectException extends Exception{

	public MenuSelectException() {
		
		AccountManager account = new AccountManager(50);
		
		try {
		System.out.println("1-5사이 숫자만 입력하세요");
		}
		catch(InputMismatchException e){
			System.out.println("입력 오류");
			e.printStackTrace();
		}
	}	
}

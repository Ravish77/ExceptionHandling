package exception.atm;

import java.util.Scanner;


class InvalidUserInputException extends Exception{
	
	public InvalidUserInputException(String msg) {
		super(msg);
	}
	
}

class ATM{
	
	private int accNum = 11111;
	private int password = 1234;
	private int aN;
	private int pw;
	
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account number");
		aN=sc.nextInt();
		System.out.println("Enter the password");
		pw=sc.nextInt();
	}
	
	public void verify() throws InvalidUserInputException{
		if(accNum==aN && password==pw) {
			System.out.println("Collect Your cash....");
		}else {
			/*
			 * InvalidUserInputException iu = new InvalidUserInputException();
			 * System.out.println("Invalid Credentials..."); 
			 * throw iu;
			 */
			throw new InvalidUserInputException("Invalid Credentials...");
			
			
		}
		
		
	}
	
}


class Bank{
	public void initiate() {
		ATM atm = new ATM();
		try {
			atm.input();
			atm.verify();
		} catch (InvalidUserInputException e) {
			try {
				atm.input();
				atm.verify();
			} catch (InvalidUserInputException e2) {
				try {
					atm.input();
					atm.verify();
				} catch (InvalidUserInputException e3) {
					System.out.println("Your ATM Card blocked...Reach out your bank for more info..");
				}
			}
		}
		
		
	}
}


public class AtmApp {

	public static void main(String[] args) {

		Bank bank = new Bank();
		bank.initiate();
		
	}

}

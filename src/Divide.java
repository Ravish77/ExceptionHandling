import java.util.Scanner;

public class Divide {
	
	//Handling the exception using try and catch
	public void divisionInt() {
		try {	
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first number :");
			int num1 = sc.nextInt();
			System.out.println("Enter the second number:");
			int num2 = sc.nextInt();
			
			int result = num1/num2;
			System.out.println("Result is:"+result);
		}catch (ArithmeticException e) {
			System.out.println("Please enter proper input, number can not be divide by 0");
		}
		catch (Exception e) {
			System.out.println("Please enter proper input...");
		}
		
	}
	
	
	//ducking the exception, user who is calling this method can handle the exception
	public void divisonFloat() throws ArithmeticException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :");
		float num1 = sc.nextFloat();
		System.out.println("Enter the second number:");
		float num2 = sc.nextFloat();
		
		float result = num1/num2;
		System.out.println("Result is:"+result);
	}
	
	
	//Re-throwing the exceptions- Throwing the handled exception object
	public void divisonFloatByInt() throws ArithmeticException{
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the first number :");
			int num1 = sc.nextInt();
			System.out.println("Enter the second number:");
			int num2 = sc.nextInt();

			int result = num1/num2;
			System.out.println("Result is:"+result);
			
		} catch (ArithmeticException ae) {
			System.out.println("Denominator can not be 0..please try again..."); 
			throw ae;
		}
		//after throw keyword statements below that will not get executed. 
		//So use finally block to write critical statements.
		finally {
			sc.close();
		}
		
	}
	
	int test() {
		try {
			System.out.println("In Test's Try");
			return 10;
		}
		finally {
			System.out.println("In test's finally");
		}
		
	}
	
	
}

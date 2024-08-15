
public class Main {

	public static void main(String[] args) {
		
		Divide divide = new Divide();
		//divide.divisionInt();
		
		//divide.divisonFloat();
		try {
			
			divide.divisonFloatByInt();
		}catch (Exception e) {
			System.out.println("Handled..");
		}
		
		System.out.println(	divide.test());
		
		
	}

}

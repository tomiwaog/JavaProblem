package general;

public class ExceptionHandling {
	/*
	 * Exception - abnormal conditions in a program that may cause abrupt
	 * termination
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// e.g ArithmeticException when dividing by 0
		//When exception occurs, it immediately looks for matching catch block
		//When NoError, skips the catch block
	
		try {
			int a = 10;
			int b = 0;
			int c = a / b;
			System.out.println(c);
		}catch(ArithmeticException e){
			System.out.println("Exception e just happened");
		}
		catch (Exception e) {
			System.out.println("Cannot divide by Zero");
		}

		System.out.println("program ends");
	}

}

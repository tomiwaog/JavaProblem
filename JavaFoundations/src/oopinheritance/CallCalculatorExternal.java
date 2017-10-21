package oopinheritance;

public class CallCalculatorExternal {

	public static void main(String[] args) {
		//Calling Calculator class from this class
		int num1 = 5; int num2=8;
		System.out.println("Result is: "+Calculator.powerInt(num1, num2));
	}
}

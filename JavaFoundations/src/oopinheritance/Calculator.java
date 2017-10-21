package oopinheritance;

public class Calculator {

	public static int powerInt(int num1, int num2){
		int sum=1;
		for (int i=1;i<=num2;i++){
			sum*=num1;
		}
		return sum;
	}
	
	public static double powerDouble(double num1, int num2){
		double sum=1;
		for (int i=1;i<=num2;i++){
			sum*=num1;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(powerInt(2,7));
		System.out.println(powerDouble(2.0,7));
	}

}

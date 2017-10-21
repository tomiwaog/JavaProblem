package general;

import java.util.InputMismatchException;
import java.util.Scanner;

public class fml {

	public static int div(int a,int b){
		int num=0;
		try{
			num=a/b;
			
		}catch(ArithmeticException x){
			System.out.println("cannot divide by zero");
		}
		return num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean check= true;
		while(check){
		try{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter num2: ");
		int num2 = sc.nextInt();
		System.out.println(div(num1, num2));
		check=false;
		sc.close();
		}
		catch(InputMismatchException i){
			System.out.println("You entered wrong input");
			check = true;
			
		}
		}
	}

}

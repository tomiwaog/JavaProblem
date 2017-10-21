package stringstringbuffer;

import java.util.Scanner;

public class FirstTwoRepeated {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String myString = sc.nextLine();
		
		for (int i=0; i<myString.length();i++){
			System.out.print(myString.substring(0,2));			
		}
		sc.close();
	}
}

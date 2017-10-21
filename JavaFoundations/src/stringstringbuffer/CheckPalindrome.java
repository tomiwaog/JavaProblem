package stringstringbuffer;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your text: ");
		String myString = sc.nextLine();
		String reversed = new StringBuffer(myString).reverse().toString();
		if (myString.equals(reversed)){
			System.out.println(myString + " is a Palindrome");
		}
		else
			System.out.println(myString + " is NOT a Palindrome");
		
		sc.close();
	}

}

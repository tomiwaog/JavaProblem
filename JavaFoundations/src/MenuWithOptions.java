import java.util.Scanner;

public class MenuWithOptions {
	public static Scanner sc = new Scanner(System.in);
	static int result = 0;

	public static void main(String[] args) {
		String contin = "";
		int option;

		do {
			System.out.print("\nEnter num1: ");
			int num1 = sc.nextInt();
			System.out.print("Enter num2: ");
			int num2 = sc.nextInt();

			System.out.println("1.Add\n2.Sub");
			System.out.print("Select Option from the menu: ");
			option = sc.nextInt();

			switch (option) {
			case 1:
				result = num1 + num2;
				System.out.println(num1 + " + "+ num2 +" = "+result);
				break;
			case 2:
				result = num1 - num2;
				System.out.println(num1 + " - "+ num2 +" = "+result);
				break;
			}

			System.out.print("Would you like to continue? :\n");
			
			contin = sc.next();

		} while (contin.toLowerCase().equals("y")); //Y or y
		System.out.println("You did not press y, Program is exiting");
	}

}

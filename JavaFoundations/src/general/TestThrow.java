package general;

import java.nio.InvalidMarkException;
import java.util.Scanner;

public class TestThrow {

	public static void getDetails() throws Exception {
		Scanner scan = new Scanner(System.in);
		scan.close();
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("Enter Age");
				int age = 0;
				try {
					age = Integer.parseInt(scan.nextLine());

				} catch (NumberFormatException nfe) {

				}
				if (age < 18)
					throw new Exception();

				System.out.println("Enter Name");
				String name = scan.nextLine();

				System.out.println("Enter Occupation");
				String occupation = scan.nextLine();

				System.out.println(name + "," + age + "," + occupation);
			} catch (InvalidMarkException ine) {
				System.out.println(ine);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		getDetails();

	}

}

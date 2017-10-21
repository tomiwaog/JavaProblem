import java.util.Scanner;

public class PrimeNumbersBetweenTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your first number: ");
		int fnumber = sc.nextInt();
		System.out.print("Please enter your second number: ");
		int snumber = sc.nextInt();

		sc.close();
		for (; fnumber <= snumber; fnumber++) {
			boolean prime = true;
			for (int i = 2; i < fnumber; i++) {
				if (fnumber % i == 0) {
					prime = false;
					break;
				}
			}
			if (prime)
				System.out.println(fnumber + " is prime");
			else
				System.out.println(fnumber + " is NOT prime");
		}
	}

}

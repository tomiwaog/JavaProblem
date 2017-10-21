import java.util.Scanner;
public class AddLastdDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number");
		 int num1 = sc.nextInt();
		 System.out.println("Enter second Number");
		int num2 = sc.nextInt();
		System.out.println(num1%10 + num2%10);
		sc.close();
	}
}
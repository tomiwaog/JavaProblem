import java.util.Scanner;
public class AddLastdDigitsInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number");
		 String num1 = sc.nextLine();
		 System.out.println("Enter second Number");
		String num2 = sc.nextLine();
		int sum = Character.getNumericValue(num1.charAt(1))+ Character.getNumericValue(num2.charAt(1));
		System.out.println(sum);
		sc.close();
	}

}

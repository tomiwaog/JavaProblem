import java.util.Scanner;


public class GetNameOfMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String months[] = {"January", "February", "March", "April", "May", "June",
				"July", "August", "September", "October", "November", "December" };

		if (num > 0 && num<13)
			System.out.println(months[num-1]);
		else
			System.out.println("You have entered an Invalid Month");
		
		sc.close();
	}

}

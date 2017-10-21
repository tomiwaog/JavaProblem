import java.util.Scanner;


public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter A number: ");
		int number = sc.nextInt();
sc.close();
		if (number > 0){
			System.out.println("Number entered is Positive");
		}
		else{
			if (number< 0){
				System.out.println("Number entered is Negative");
			}
			else if (number == 0)
				System.out.println("Number entered is ZERO");
			else
				System.out.println("You have not entered a number");
		}
	}

}

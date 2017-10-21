import java.util.Scanner;


public class EvenNumbersBetweenTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your first number: ");
		int fnumber = sc.nextInt();
		
		System.out.print("Please enter your second number: ");
		int snumber = sc.nextInt();

		for (int i=fnumber+1;i<snumber;i++){
			if (i%2 == 0)
				System.out.println(i);
		}
			sc.close();
	}

}

import java.util.Scanner;

public class GenderRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter gender: ");
		String gender = sc.nextLine();
		System.out.print("Please enter age: ");
		int age = sc.nextInt();
		
		System.out.println(calcInterestRate(gender, age));
		sc.close();
	}

	public static String calcInterestRate(String gender, int age) {
		String result = "";
		if (gender.equals("Female")) {
			if (age >= 1 && age <= 58) {
				result=  "The Interest rate is " + 8.2 + "%";
			} else if (age >= 59 && age <= 120) {
				result=  "The Interest rate is " + 7.6 + "%";
			}
		} else if (gender.equals("Male")) {
			if (age >= 1 && age <= 60) {
				result= "The Interest rate is " + 9.2 + "%";
			} else if (age >= 61 && age <= 120) {
				result= "The Interest rate is " + 8.3 + "%";
			}
		} else {
			result+= "ERROR1 You have not entered an appopriate gender";
		}
		if (age>120){
			result += "ERROR! Your entered an age above 120";
		}
		return result;
	}

}

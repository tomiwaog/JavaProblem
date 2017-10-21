package logicbuilding;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseAddNum {
	static ArrayList<Integer> arrStorage = new ArrayList<Integer>();

	static ArrayList<Integer> reverse(int nums) {
		arrStorage = new ArrayList<Integer>();
		
		int myDiv = 0;
		int lastNum = 0;

		if (nums < 0) {
			nums = nums * -1;

				while (nums > 9) {
					lastNum = nums % 10; // gets last num
					myDiv = nums / 10;
					if (arrStorage.isEmpty()) {
						System.out.println("arr is empty");
						arrStorage.add(lastNum * -1);
					} else {
						System.out.println("arr is NOTempty");
						arrStorage.add(lastNum); // store last num in Arr
					}
					nums = myDiv;
				}
				arrStorage.add(myDiv);
			

		} else {

				while (nums > 9) {
					lastNum = nums % 10; // gets last num
					myDiv = nums / 10;
					arrStorage.add(lastNum); // store last num in Arr
					nums = myDiv;
				}
				arrStorage.add(myDiv);
			}
		
		return arrStorage;
	}

	static int arrayListToInt(ArrayList<Integer> numbers) {
		int returnedInt = 0;String conc="";
		for (int i = 0; i < numbers.size(); i++) {
			
			conc += numbers.get(i);
		}
		returnedInt = Integer.parseInt(conc);
		return returnedInt;
	}

	static void printArr() {
		for (int i = 0; i < arrStorage.size(); i++) {
			System.out.println(arrStorage.toString());
		}
	}
	
	

	public static void main(String[] args) {
		int sum=0;

		char answer = 'y';
		do{
			Scanner sc = new Scanner(System.in);
			System.out.print("Please enter a number to add:");
			int userInput = sc.nextInt();
			sc.close();
			if(userInput > 9)
				sum+=arrayListToInt(reverse(userInput)); //add reverse
			else{
				sum+=userInput; 
			}
			System.out.println("Would you like to enter another Number"+
			". Y or N");
			answer = sc.next().charAt(0);
		}while(answer=='y');
		System.out.println("sum of all numbers is "+sum);
		
	}
}

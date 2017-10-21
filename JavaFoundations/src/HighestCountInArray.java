import java.util.ArrayList;

public class HighestCountInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = { 5, 21, 122, 21, 34, 2, 5, 122, 57, 1, 5 };
		int counter = 0;
		// Create a new list to store visited numbers
		ArrayList<Integer> visitedNumbers = new ArrayList<Integer>();

		for (int j = 0; j < numbers.length; j++) {
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] == numbers[j]) {
					counter++;
				}
			}
			// Count and visit If index of array not already in visitedlist
			if (!visitedNumbers.contains(numbers[j])) {
				visitedNumbers.add(numbers[j]);
				System.out.println(numbers[j] + " found " + counter + " times");
			}
			counter = 0;
		}

	}
}

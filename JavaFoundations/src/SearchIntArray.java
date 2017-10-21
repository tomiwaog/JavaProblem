import java.util.Scanner;

public class SearchIntArray {
	public static int findInArray(int arr[], int x) {
		for (int i = 0; i < arr.length; i++) {
			if (x == arr[i]) {
				System.out.println(x + " was found in array at position "
						+ (i + 1));
				return (i+1);
			}
		}
		System.err.println("Not found\n");
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number to find: ");
		int x = sc.nextInt();
		int numbers[] = { 5, 21, 34, 2, 122, 57, 1 };

		
		sc.close();
		System.out.println(findInArray(numbers, x));

	}

}

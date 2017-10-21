import java.util.Arrays;

public class RemoveArrDuplicates {

	/*
	public static int findInArray(int arr[], int x) {
		for (int i = 0; i < arr.length; i++) {
			if (x == arr[i]) {
				System.out.println(x + " was found in array at position "
						+ (i + 1));
				return (i + 1);
			}
		}
		System.err.println("Not found\n");
		return -1;
	}
*/
	public static int[] removeDuplicates(int[] arr) {

		return Arrays.stream(arr).distinct().toArray();
	}

	public static void main(String[] args) {
		int numbers[] = { 122,5, 21, 5, 34, 2, 122, 57, 1 };
//Thanks to Java8
		for (int i = 0; i < removeDuplicates(numbers).length; i++) {
			System.out.println(removeDuplicates(numbers)[i]);
		}
	}

}

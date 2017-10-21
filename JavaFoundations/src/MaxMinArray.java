public class MaxMinArray {

	public static int[] findMinMax(int[] arr) {

		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		int minmax[] = { min, max }; // Java doesnt support multi value returns,
										// so used an array
		return minmax;
	}

	public static void main(String[] args) {
		int numbers[] = { 5, 21, 34, 2, 122, 57, 1 };

		System.out.println("Min number is " + findMinMax(numbers)[0]);
		System.out.println("Max number is " + findMinMax(numbers)[1]);

	}

}

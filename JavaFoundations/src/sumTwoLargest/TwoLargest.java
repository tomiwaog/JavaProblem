package sumTwoLargest;

//import java.util.Arrays;

public class TwoLargest {

	public static int turnNumToArrAndSumMax(int x) {
		String stringo = Integer.toString(x);
		int result[] = new int[stringo.length()];
		for (int i = 0; i < stringo.length(); i++) {
			result[i] = Character.getNumericValue(stringo.charAt(i));
		}
		// System.out.println("Turn arr is " + Arrays.toString(result));
		result = getTwoMax(result);
		String rand = result[0] + "" + result[1];
		int totalo = Integer.parseInt(rand);
		System.out.println("sum of each : " + totalo);
		return totalo;
	}

	public static int[] getTwoMax(int[] arr) {
		int twoMaxNums[] = new int[2];
		int maxOne = 0, maxTwo = 0;
		for (int i : arr) {
			if (i > maxOne) {
				maxTwo = maxOne;
				maxOne = i;
			} else if (i > maxTwo) {
				// update maxTwo
				maxTwo = i;
			}
		}
		twoMaxNums[0] = maxOne;
		twoMaxNums[1] = maxTwo;
		// System.out.println("2 large " + Arrays.toString(twoMaxNums));
		return twoMaxNums;
	}

	public static int finalCal(int[] arr) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += turnNumToArrAndSumMax(arr[i]);
		}
		return total;
	}

	public static void main(String[] args) {
		// int splitter = turnNumToArrAndSumMax(411);
		// System.out.println("concat is "+splitter+"\n");
		int tester[] = { 997, 37221, 10270, 73391 };
		// System.out.println(getTwoMax(splitter));

		System.out.println("Actual: " + finalCal(tester));
		System.out.println("debug: " + (99 + 73 + 72 + 97));
	}

}

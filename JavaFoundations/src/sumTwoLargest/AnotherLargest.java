package sumTwoLargest;
//import java.util.Arrays;

public class AnotherLargest {

	public static int[] turnNumToArr(int x) {
		String stringo = Integer.toString(x);
		int result[] = new int[stringo.length()];
		for (int i = 0; i < stringo.length(); i++)
			result[i] = Character.getNumericValue(stringo.charAt(i));
		// System.out.println("Turn arr is " + Arrays.toString(result));
		return result;
	}

	public static int[] getTwoMaxNums(int[] arr) {
		int twoMaxNums[] = new int[2];
		int maxOne = 0, maxTwo = 0;
		for (int i : arr) {
			if (i > maxOne) {
				maxTwo = maxOne;
				maxOne = i;
			} else if (i > maxTwo)
				maxTwo = i;// update maxTwo
		}
		twoMaxNums[0] = maxOne;
		twoMaxNums[1] = maxTwo; // System.out.println("2 large "+Arrays.toString(twoMaxNums));
		return twoMaxNums;
	}

	public static int concatNumArr(int[] numArr) {
		String rand = numArr[0] + "" + numArr[1];
		int joinedNums = Integer.parseInt(rand);
		// System.out.println("sum of each : " + joinedNums);
		return joinedNums;
	}

	public static int fullApp(int[] arr) {
		int total = 0;
		for (int each : arr)
			total += concatNumArr(getTwoMaxNums(turnNumToArr(each)));
		return total;
	}

	public static void main(String[] args) {
		int tester[] = { 9987, 37221, 10280, 73391 };
		System.out.println("Actual: " + fullApp(tester));
		System.out.println("debug: " + (99 + 73 + 82 + 97));
	}
}
package stringstringbuffer;

public class StringOddNull {

	static String solveString(String myString) {
		if (myString.length()%2 == 0) {
			System.out.println(callEven(myString));
		} else {
			System.out.println(callOdd());
		}
		return "";
	}

	static String callOdd() {
		return "NULL";

	}

	static String callEven(String theString) {
		String firstHalf;
		firstHalf = theString.substring(0, theString.length()/2);
		return firstHalf.toString();
	}

	public static void main(String[] args) {
		String myString = "testingi";
		solveString(myString);
		
	}

}
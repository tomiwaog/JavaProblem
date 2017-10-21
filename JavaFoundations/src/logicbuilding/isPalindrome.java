package logicbuilding;

//Program set output to 1 if Palindrome, otherwise 2.
public class isPalindrome {
	static int output1 = 0;

	public static void main(String[] args) {
		String myString = "Olloj";
		if (isPal(myString.toLowerCase()))
			output1 = 1;
		else
			output1 = 2;
		System.out.println(output1); //print output1
	}

	//Using built in reverse
	public static boolean isPal(String myString) {
		//Using built in reverse
		//return myString.equals(new StringBuffer(myString).reverse().toString());
		//Or use my method 
		return myString.equals(reverseString(myString));
	}

	//Self made reverse method
	public static String reverseString(String myString) {
		StringBuffer newString = new StringBuffer();
		int length = myString.length();
		for (int i = (length - 1); i >= 0; i--) {
			char myVar = new StringBuffer(myString).charAt(i);
			newString.append(myVar);
		}
		String finalString = newString.toString();
		return finalString;
	}
}

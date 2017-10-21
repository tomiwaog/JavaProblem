package stringstringbuffer;

import java.util.Scanner;

public class ConcatOmitDoubleChar {
	static String merger(String string1, String string2) {
		if (string1.charAt(string1.length() - 1) == string1.charAt(string1
				.length() - 2)) {
			System.out.println();
			string1 = stripEnd(string1);
		}
		if (string2.charAt(0) == string2.charAt(1))
			string2 = stripStart(string2);
		if (string1.charAt(string1.length() - 1) == string2.charAt(0)) {
			char letter = string1.charAt(string1.length() - 1);
			String result = string1.substring(0, string2.length()) + letter
					+ string2.substring(1);
			return result;
		} else
			return "Concantenated is : " + (string1 + string2).toLowerCase();
	}
	static boolean needStripping(String string1) {
		return (string1.charAt(-1) == string1.length() - 2);
	}
	private static String stripEnd(String string1) {
		char letter = string1.charAt(string1.length() - 1);
		int length = string1.length() - 1;
		int location = 0;
		for (int i = length; i > 0; i--) {
			// System.out.println(string1.charAt(i));
			if (string1.charAt(i - 1) == letter) {
				location = i - 1;
			}
		}
		return string1.substring(0, location) + letter;
	}
	private static String stripStart(String string1) {
		char letter = string1.charAt(0);
		int length = string1.length() - 1;
		int location = 0;
		for (int i = 0; i < length; i++) {
			// System.out.println(string1.charAt(i));
			if (string1.charAt(i) == letter) {
				location = i - 2;
			}
		}
		return string1.substring(location);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strOne = "helloooooo";
		strOne = strOne.toLowerCase();
		String strTwo = "ooooootom";
		System.out.println(merger(strOne, strTwo));
		sc.close();
	}
}
package prep;

import java.util.ArrayList;

public class Another {
	static ArrayList<String> arr = new ArrayList<String>();

	public static ArrayList<String> stripWords(String words) {
		int n = 0;
		for (int i = n; i < words.length(); i++) {
			if (words.charAt(i) == ' ') {
				arr.add(words.substring(n, i));
				n = i;
			}
		}
		arr.add(words.substring(n, words.length()));
		return arr;
	}

	public static ArrayList<String> reverseWords(ArrayList<String> words) {
		ArrayList<String> newArr = new ArrayList<String>();
		for (int i = 0; i < words.size(); i++) {
			StringBuffer sb = new StringBuffer(arr.get(i));
			String rev = sb.reverse().toString();
			newArr.add(rev.substring(0, rev.length())); // rids extrra spacing
		}
		return newArr;
	}

	public static int[] capsLocCount(String words) {
		int[] capsLoc = new int[words.length()];
		int counter = -1;
		for (int i = 0; i < words.length(); i++) {
			char caps = words.toUpperCase().charAt(i);
			if (words.charAt(i) != ' ') {
				if (words.charAt(i) == caps) {
					capsLoc[++counter] = i;
				}
			}
		}
		for (int i = 0; i < counter; i++) {
			System.out.println("loc of caps " + capsLoc[i]);
		}
		return capsLoc;
	}

	public static String arrToString(ArrayList<String> words) {
		String result = "";
		for (int i = 0; i < words.size(); i++) {
			result += words.get(i) + " ";
		}

		return result;
	}

	public static void reverseWords_andCase(String sentence, int case_option) {
		if (case_option == 0) {
			String result = arrToString(reverseWords(stripWords(sentence)));
			System.out.println(result);
		} else if (case_option == 1) {
			int capsLoc[] = capsLocCount(sentence);
			String result = arrToString(reverseWords(stripWords(sentence)))
					.toLowerCase();
			String result1 = "ddd";

			for (int i = 0; i < capsLoc.length; i++) {
				StringBuffer sb = new StringBuffer(result);
				

				result1 = sb.toString();
			}
			System.out.println(result1);
		}
	}

	public static void main(String[] args) {
		String sentence = "Wipro TechNologies BangaLore";

		reverseWords_andCase(sentence, 0);

	}
}

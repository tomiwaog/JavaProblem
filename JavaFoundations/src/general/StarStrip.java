package general;

import java.util.ArrayList;


public class StarStrip {

	static String word = "ab**chhd*";
	static ArrayList<String> arr = new ArrayList<String>();

	public static ArrayList<String> stripper() {
		StringBuffer s = new StringBuffer(word);
		System.out.println(" s is " + s);
		for (int i = 0; i < word.length()-1; i++) {
			if (s.charAt(i) == '*') {
				i++; 
			} else if (s.charAt(i+1) == '*') {
				i++;
			} else {
				String letter = Character.toString(s.charAt(i));
				arr.add(letter);
			}
		}
		if (!s.substring(s.length()-1).equals("*")){
			arr.add(s.substring(s.length()-1));
		}
		return arr;
	}

	public static void main(String[] args) {
		stripper();
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i));
		}
	}
}

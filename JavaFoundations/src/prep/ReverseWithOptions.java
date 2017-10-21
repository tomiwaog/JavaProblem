package prep;

public class ReverseWithOptions {
	static int count = 0;
	static int[] arr = new int[10];

	public static int[] spaceLoc(String words) {

		for (int i = 0; i < words.length(); i++) {
			if (words.charAt(i) == ' ') {
				arr[++count] = i;
			}
		}
		return arr;
	}

	public static String reverseString(String words) {
		StringBuffer sBuffer = new StringBuffer(words);
		String newWords = sBuffer.reverse().toString();
		return newWords;
	}

	public static void reverseWords_andCase(String sentence, int case_option) {
		switch (case_option) {
		case 0:
		case 1:
		case 2:
		default:
			System.out.println("didnt enter anything");
		}

	}

	public static String caseZero(String words){
		spaceLoc(words);
		String newWord="";
		for (int i = 1; i <= count; i++) {
			String lol = reverseString(words.substring(arr[i-1], arr[i]))+ " ";
			newWord+=lol;
		}
		newWord+=reverseString(words.substring(arr[count]));
		return newWord;
	}
	
	public static void main(String[] args) {
		
		String an = caseZero("Wipro TechNologies BangaLore");
		System.out.println(an);
	}

}

package prep;

public class PowerAddNumbers {
	public static int powerCalc(int x, int y) {
		int n = 1;
		for (int i = 1; i <= y; i++) {
			n *= x;
		}
		return n;
	}

	public static int numCounter(int num) {
		int counter = 0;
		while (num > 0) {
			num = num / 10;
			counter++;
		}
		return counter;
	}


	public static int task(int input1) {
		String nowStr = Integer.toString(input1);
		int total =0;
		@SuppressWarnings("unused")
		StringBuffer s= new StringBuffer(nowStr);
		int nums = numCounter(input1);
		for (int i=0;i<nowStr.length();i++){
			int x = nowStr.charAt(i)- '0';
			total += powerCalc(x, nums--);
		}
		return total; 
	}

	public static void main(String[] args) {
		System.out.println(task(234));

	}

}

package logicbuilding;

public class AddLastDigits {
	static int sum = 0;

	public static int sum(int numbers[]) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
	
	static int[] SaveStringAsArrayNum(String numbers){
		int[]arrNumbers = new int[10];
		for (int i=0;i<numbers.length();i++){
			arrNumbers[i]=Integer.parseInt(numbers.substring(i, i+1));
		}
		return arrNumbers;		
	}

	public static void main(String[] args) {
		int numbers[] = { 2, 24,2,2 };
		sum = sum(numbers);
		while (Integer.toString(sum).length()>1) {
			sum = sum(SaveStringAsArrayNum(Integer.toString(sum)));
			if (sum<=9){
				break;
			}
		}
		System.out.println(sum);
		
	}

}

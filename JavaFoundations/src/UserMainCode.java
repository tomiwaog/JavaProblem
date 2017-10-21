
class UserMainCode {

	public static int output1;
	public static int longestCounter = 0;
	public static int oldCounter = 0;

	public static void longestIncreasingSeq(int input1, int[] input2) {

		// Write code here
		for (int i = 1; i < input2.length; i++) {
			if (input2[i] > input2[i - 1]) {
				longestCounter++;
			} else {
				if (longestCounter > oldCounter) {
				}
				oldCounter = longestCounter;
				longestCounter = 0;
			}
		}
		if (longestCounter==0){
			if (oldCounter>longestCounter){
				output1=(oldCounter+1);
			}else{
				output1=0;
			}
			System.out.println(output1);
		}else{
		output1 = (longestCounter + 1);
		System.out.println(output1);
		}
	}
	

	public static void main(String[] args) {
		int arr[] = {1,3,2};
		longestIncreasingSeq(3, arr);
	}
	
}
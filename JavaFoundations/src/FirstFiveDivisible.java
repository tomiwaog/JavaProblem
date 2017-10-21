//5 numbers divisible by 2,3 and 5
public class FirstFiveDivisible {

	public static void main(String[] args) {
		int count = 0;
		// TODO Auto-generated method stub
		for (int i=1; i<100000; i++){
			if (i%2==0 && i%3==0 && i%5==0){
				count++;
				System.out.println(i);
				if (count==5){
					break;
				}
				
			}
		}
	}

}

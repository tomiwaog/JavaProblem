import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your word: ");
		String mytext = sc.nextLine();
		String left = null, right = null;
		int mid = mytext.length()/2;
		left = mytext.substring(0, mid);
		sc.close();
		if (mytext.length()%2 == 0){
			right = mytext.substring(mid, mytext.length());
		}
		else{
			right = mytext.substring(mid+1, mytext.length());
		}
			System.out.println("left is "+ left);
			System.out.println("right is "+ right);
			
			if (left.equals(new StringBuffer(right).reverse().toString())){
				System.out.println("We have a Palindrome");
			}
			else{
				System.out.println("Its not a Palindrome");
			}
	}
}


public class ReverseStringTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strOne = args[0];

		String strTwo = args[1];
		String bothStr = strOne+ " "+ new StringBuffer(strTwo).reverse().toString();;
		System.out.println(bothStr);
	}

}

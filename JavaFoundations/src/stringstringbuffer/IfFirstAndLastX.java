package stringstringbuffer;
//Omits first and last letter
public class IfFirstAndLastX {

	public static void main(String[] args) {
		//If first letter or last letter is x;
		String myStr = "xHix";
		if (myStr.charAt(0)=='x' || myStr.charAt(myStr.length()-1) == 'x'){
			System.out.println(myStr.substring(1,myStr.length()-1));	
		}
	}
}

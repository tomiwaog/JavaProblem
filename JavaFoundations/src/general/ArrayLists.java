package general;
//When heterogenous element is stored in ArrList,
//operation may get complicated .i.e. division on Strings
//instead of using if statement to check for type, use generics
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> a = new ArrayList<Integer>(); //
		
		a.add(2);
		a.add(17);
		a.add(23);
		
		System.out.println("Traditional for loop");
		for (int i=0; i<a.size(); i++)
			System.out.println(a.get(i)*2); //Accessing elements in ArrList
		
		System.out.println("Enhanced for loop");
		for (Object o: a)
			System.out.println((int)o*2);
		
		System.out.println("Iterator");
		Iterator<Integer> i = a.iterator();
		
		while(i.hasNext())
			System.out.println((int)i.next()*2);
	}

}

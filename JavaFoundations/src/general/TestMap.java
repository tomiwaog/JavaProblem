package general;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestMap {

	public void countChar(String s) {
		s=s.toLowerCase();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			Integer val = (Integer) map.get(ch);

			if (val == null) {
				map.put(ch, 1);
			}else{
				val++;
				map.put(ch, val);
			}
		}
		
		@SuppressWarnings("rawtypes")
		Set keys=map.keySet();
		@SuppressWarnings("rawtypes")
		Iterator i=keys.iterator();
		
		while(i.hasNext()){
			Character key = (Character)i.next();
			System.out.println(key+ ": "+ map.get(key));
		}
	}

	public static void main(String[] args) {

		TestMap t = new TestMap();
		t.countChar("Towerhill");
		
		int a[] = {1,2,3};
		System.out.println(a[5]);
	}
}

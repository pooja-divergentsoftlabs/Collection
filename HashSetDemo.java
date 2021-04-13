package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	
	public void demo() {
		HashSet<String> set = new HashSet<String>();
		set.add("Morning");
		set.add("Afternoon");
		set.add("Evening");
		
		Iterator <String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void main(String[] args) {
		HashSetDemo hsd = new HashSetDemo();
		hsd.demo();
	}
}

package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public void demo() {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(2);
		ts.add(13);
		ts.add(1);
		
		Iterator<Integer> it =ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void main(String[] args) {
		TreeSetDemo tsd = new TreeSetDemo();
		tsd.demo();
	}

}

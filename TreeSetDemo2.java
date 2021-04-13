package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo2 {
	
	public void demo() {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(2);
		ts.add(13);
		ts.add(21);
		ts.add(16);
		
		Iterator<Integer> it =ts.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void main(String[] args) {
		TreeSetDemo2 tsd = new TreeSetDemo2();
		tsd.demo();
	}

}

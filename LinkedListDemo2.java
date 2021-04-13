package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo2 {
	public static void linkedList() {
		LinkedList<String> str = new LinkedList<String>();
		str.add("pooja");
		str.add("avni");
		str.add("nidhi");

		Iterator itr = str.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {

		LinkedListDemo2 demo2 = new LinkedListDemo2();
		demo2.linkedList();

	}

}

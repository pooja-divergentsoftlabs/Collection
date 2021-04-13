package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public void linkedList() {
	LinkedList<String> str= new LinkedList<String>();
	str.add("pooja");
	str.add("avni");
	str.add("nidhi");
	
	Iterator <String> itr=str.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}}
	
	public static void main(String[] args) {
		LinkedListDemo demo = new LinkedListDemo();
		demo.linkedList();
	}

}

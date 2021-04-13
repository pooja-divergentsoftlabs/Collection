package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {
	public static void arrayList() {
		List<String> al =new ArrayList<String>();
		al.add("pooja");
		al.add("avni");
		al.add("lay");
		
		List<String> al2=new LinkedList<String>();
		al2.add("nidhi");
		al2.add("satyam");
		al2.add("ram");
		
		System.out.println("array list:"+al);
		System.out.println("linked list:"+al2);
	}
	
	public static void main(String[] args) {
		
		ArrayListDemo demo = new ArrayListDemo();
		demo.arrayList();
		}
}

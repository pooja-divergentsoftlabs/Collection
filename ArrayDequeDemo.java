package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
	public void deque() {
	  Deque<String> deque = new ArrayDeque<String>();  
	   deque.add("pooja");    
	   deque.add("nidhi");     
	   deque.add("avni");    
	     
	   for (String str : deque) {  
	   System.out.println(str);  
	   }  
	   } 
	public static void main(String[] args) {
		ArrayDequeDemo demo = new ArrayDequeDemo();
		demo.deque();
	}

}

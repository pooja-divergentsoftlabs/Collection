package collection;


import java.util.LinkedList;
import java.util.List;

public class ListForEach {
	public void demo() {
		List<String> str = new LinkedList<String>();
		str.add("red");
		str.add("blue");
		str.add("green");
		
		for(String color:str) {
			System.out.println(color);
		}
	}
	
	public static void main(String[] args) {
		ListForEach each = new ListForEach();
		each.demo();
	}
}

package collection;

import java.util.Vector;

public class VectorDemo {
	public void demo() {
		Vector<String> v = new Vector<String>();

		v.add("red");
		v.add("blue");
		v.add("green");
		v.add("yellow");
		v.addElement("pink");
		v.addElement("black");

		System.out.println("Elements are: " + v);
	}

	public static void main(String[] args) {
		VectorDemo vd = new VectorDemo();
		vd.demo();
	}
}

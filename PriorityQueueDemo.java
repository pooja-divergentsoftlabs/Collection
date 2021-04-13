package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	
		public static void priorityM() {
			PriorityQueue<String> queue = new PriorityQueue<String>();
			queue.add("Morning");
			queue.add("Afternoon");
			queue.add("Night");
			
			System.out.println("head of queue:" + queue.peek());
			Iterator<String> itr = queue.iterator(); 
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		}

		public static void main(String[] args) {

			PriorityQueueDemo.priorityM();
		}
	}



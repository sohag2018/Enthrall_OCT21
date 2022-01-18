package Lec_CollectionFramework_Queue;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Queue_02_ImplementedByLinkedList {
	
	//In this class will crate a queue by LinkedList and add some elements by using add()
	//then see which is head and which is tail
	//Then will use peak() to see which one is on the top (at top position in queue)--but it will not remove 
	//we will use poll()---will remove the top element & remove()---it will remove but if queue is empty-- throw NoSuchElementException, empty()

	public static void main(String[] args) {
		//creating queue implementing by LinkedList
		Queue<String> q=new LinkedList<>();
		
		//adding element in queue
		q.add("C");
		q.add("A");
		q.add("B");
		q.add("D");
		
		//see the head/top element in queue
		System.out.println(q.peek());
		System.out.println(q); //printing queue
		q.poll();//removing queue
		System.out.println(q.peek());
		System.out.println(q);
		q.poll();
		System.out.println(q.peek());
		System.out.println(q);
		q.remove();
		System.out.println(q.peek());
		q.remove();
		System.out.println(q.peek());//null
		//.remove();//queue is empty--if you call remove() will get Exception
	

	}

}

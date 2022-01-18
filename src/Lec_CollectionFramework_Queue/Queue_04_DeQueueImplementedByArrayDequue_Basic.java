package Lec_CollectionFramework_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue_04_DeQueueImplementedByArrayDequue_Basic {
	
	//In this class we see basic diff in Deque comparing with Queue
	//Create Deque implemented by ArrayDeque Class
	//We will see in Deque elements can add from both side by using  push()-top, add()-Bottom,offer()-bottom--- addFirst/addLast  offerFirst(), OfferLast()
	//

	public static void main(String[] args) {
		Deque<Integer> dq=new ArrayDeque<>();
		dq.add(5);//adding at the bottom
		dq.add(15);
		dq.push(50); //this will be addeding at the top
		dq.push(70); //this will be added at the top
		dq.add(115);
		dq.offer(1);//this is like add()
		dq.add(1150);
		dq.add(1150);
		dq.addFirst(100);
		dq.addLast(0);
		dq.offerFirst(10000);
		
		
		for(int singldq:dq) {
			System.out.println(singldq);
		}
		

	}

}

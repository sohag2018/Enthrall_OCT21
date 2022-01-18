
package Lec_CollectionFramework_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue_05_Deque_ImpLinkedList_removeElements {
	
	//in this class we will see diff methods for removing elements
	

	public static void main(String[] args) {
		Deque<Integer> dq=new ArrayDeque<>();
		dq.add(5);
		dq.add(52);
		dq.add(51);
		dq.add(15);
		dq.add(65);
		dq.push(100);
		
		System.out.println(dq.peek());//who is the top
		System.out.println(dq.peekLast());//who is bottom
		
		//removing
		System.out.println(dq.remove(100));
		System.out.println(dq.peek());//who is the top
		
		}
		
		
			
			
			

	}



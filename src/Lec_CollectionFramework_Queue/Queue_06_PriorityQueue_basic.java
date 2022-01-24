package Lec_CollectionFramework_Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_06_PriorityQueue_basic {
	
	//In this class we will see:
	//in <Integer>-----adding queue, peek the queue (which one is getting priority
	//in <String>-----adding queue, peek the queue (which one is getting priority
	//dont use iterator. use ohter logic and method from queue
	

	public static void main(String[] args) {
		
	Queue<Integer>q=new PriorityQueue<>();
	q.add(5);
	q.add(55);
	q.add(50);
	q.add(15);
	q.add(25);
	//see the top priority one
	System.out.println(q.peek());
	
	//print all
	for(int singleQ:q) {
		System.out.println(singleQ);
	}
	
	Queue<String>q1=new PriorityQueue<>();
	q1.add("Noyon");
	q1.add("Sohag");
	q1.add("Rafeez");
	q1.add("Anik");
	
	//see the top priority one
	System.out.println(q1.peek());
	
	//print all
	for(String singleQ1:q1) {
		System.out.println(singleQ1);
	}
	
	
	
	
		
		
		
		}

}


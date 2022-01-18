package Lec_CollectionFramework_Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_03_ImplementedByLinkedList_program {
	
	//In this class will crate a queue by LinkedList<String> and add some elements and do two small programs
	//1. using peek() will assert a specific element in if--else block: if yes choose one person if not choose another person
    //2. using empty() will check queue is empty or not then send the decision 
	public static void main(String[] args) {
		
		/*Queue<String> q=new LinkedList<>();
		q.add("Anik");
		q.add("Rafez");
		q.add("Kanta");
		q.add("Kanta");
		q.add("Kanta");
		
		
		if(q.peek()=="Anik") {
			System.out.println("Give this key to Anik");
		}else {
			System.out.println("Give it to Kanta");
		}
		*/
		
		Queue<String> q1=new LinkedList<>();
		q1.add("C1");
		q1.add("C2");
		q1.add("C3");
		q1.add("C4");
		q1.add("C5");
		
		//using for loop making queue empty
		for(int i=0;i<=q1.size();i++) {
			System.out.println("Still we have waiting customer.Let's do quick");
			System.out.println("Now serving:"+q1.poll());
			
			System.out.println("Now we have:"+q1);
			
			if(q1.isEmpty()) {
				System.out.println("Ok Rafez you can gor for a break");
			}
		}
		
		//using iterator making queue empty
		
	/*	Iterator i=q1.iterator(); 
		while(i.hasNext()) {
			System.out.println("Still we have waiting customer.Let's do quick");
			System.out.println("Now serving:"+q1.poll());
			
			System.out.println("Now we have:"+q1);
			
			if(q1.isEmpty()) {
				System.out.println("Ok Rafez you can gor for a break");
			}
		}*/
		}
	

}

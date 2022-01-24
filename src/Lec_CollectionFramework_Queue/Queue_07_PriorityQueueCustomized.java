package Lec_CollectionFramework_Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_07_PriorityQueueCustomized {
	
	//In this class we will see how we can customized priorityQueue
	//We will have our own type obj (own class), after that we will compare objs by using compare() 
	//which is available in comparator interface..that means we need to implement compare() and we will use our 
	//own logic to compare objs by overriding it. Next in our main class we will create priority queue obj by 
	//passing obj (new compare....) of compare class. And finally, we will add obj of our own class
	
	// Actiion: Need to create our own class
	//Need to create another class---CompareClass where we will implements Comparator interface and in compare method we will use our own logic Note:if return +1 if not -1
	//
	//finally we need to pass the obj of our own class when we will create PriorityQueue

	public static void main(String[] args) {
		
		Queue<EnthrallOctBatch> q =new PriorityQueue<>(new CompareStudents());
		
		EnthrallOctBatch st1=new EnthrallOctBatch("Noyon",100);
		EnthrallOctBatch st2=new EnthrallOctBatch("Rafez",25);
		EnthrallOctBatch st3=new EnthrallOctBatch("Fatima",30);
		EnthrallOctBatch st4=new EnthrallOctBatch("Rezwan",27);
			
		//adding elements in queue
		q.add(st1);
		q.add(st2);
		q.add(st3);
		q.add(st4);
		
		while(!q.isEmpty()) {
			System.out.println(q.poll().getName());
		}
		
		
		

	}

}

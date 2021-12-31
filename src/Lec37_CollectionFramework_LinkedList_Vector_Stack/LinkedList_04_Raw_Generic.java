package Lec37_CollectionFramework_LinkedList_Vector_Stack;

import java.util.LinkedList;

public class LinkedList_04_Raw_Generic {

	public static void main(String[] args) {
		
		//raw-Hetrogenious
		LinkedList link1=new LinkedList();
		link1.add(5);
		link1.add(5.5);
		link1.add("Sohag");
		link1.add("Sohag");//duplicate
		
		//Generic-Sting
		LinkedList<String> link2=new LinkedList();
		link2.add("Noyon");
		link2.add("Sohag");
		link2.add("Onik");
		
		
		//Generic-Integer
		LinkedList<Integer> link3=new LinkedList();
		link3.add(5);
		link3.add(15);
		link3.add(25);
		
		System.out.println("in Link3:"+link3);
		
		
		//addAll()
		LinkedList<Integer> link4=new LinkedList();
		link4.add(100);
		link4.add(200);
		System.out.println("in Link4:"+link4);
		
		link4.addAll(link3);
		System.out.println("in Link4 after using addAll():"+link4);
		
		
		

	}

}

package Lec37_CollectionFramework_LinkedList_Vector_Stack;

import java.util.LinkedList;

public class LinkedList_03_UsingSomeMethods {

	public static void main(String[] args) {
		LinkedList link=new LinkedList();
		link.add(5);
		link.add(65);
		link.add(58);
		link.add(0,15);
		System.out.println("After using add(index,value)"+link.get(0));
		System.out.println(link);		
		link.addFirst(25);
		System.out.println("After using addFirst():"+link.get(0));
		System.out.println(link);
		link.addLast(100);
		System.out.println(link);
		
		//link.clear();
		
		System.out.println("After using clear():"+link);
		
		link.set(3, 200);
		System.out.println("After using set():"+link);
		
		System.out.println(link.contains(200));
		
		link.remove(1);
		System.out.println(link);
		
		link.removeAll(link);
		System.out.println(link);
		

	}

}

package Lec37_CollectionFramework_LinkedList_Vector_Stack;

import java.util.LinkedList;

public class LinkedList_02_Basic {

	public static void main(String[] args) {
		LinkedList link=new LinkedList();
		link.add(5);
		link.add(15);
		link.add(25);
		link.add(35);
		link.add(55);
		
		System.out.println(link.indexOf(35));
		
		
		System.out.println(link.size());
		
		System.out.println(link.get(0));
		
		for(int i=0;i<link.size();i++) {
			
			System.out.println("Printing all elements by using for loop:"+link.get(i));
		}

	}

}

package Lec37_CollectionFramework_LinkedList_Vector_Stack;

import java.util.Vector;

public class Vector_02_Basic {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		v.add(5);
		v.add(5);
		v.add(5);
		v.add(5);
		v.add(5);
		v.add(5);
		v.add(5);
		v.add(5);
		v.add(5);
		v.add(5);
		System.out.println(v.capacity()); //10
		v.add(5);
		v.addElement(10);
		
		System.out.println(v.size());
		System.out.println(v.capacity()); //20
		
		System.out.println(v.get(0));
	
	}

}

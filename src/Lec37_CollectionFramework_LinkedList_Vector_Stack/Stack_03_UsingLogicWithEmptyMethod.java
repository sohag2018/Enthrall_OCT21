package Lec37_CollectionFramework_LinkedList_Vector_Stack;

import java.util.Stack;

public class Stack_03_UsingLogicWithEmptyMethod {

	public static void main(String[] args) {
		Stack sc=new Stack();
		sc.push("Sohag");
		sc.push("Mukta");
		sc.push("Noyon");
		sc.push("Sadia");
		
		
		for(int i=0;i<5;i++) {
		
		if(!sc.empty()) {
			System.out.println(sc);
			sc.pop();
			System.out.println(sc);
		}else {
			System.out.println("there is no more name to remove");
		}
		}
		

	}

}

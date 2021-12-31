package Lec37_CollectionFramework_LinkedList_Vector_Stack;

import java.util.Stack;

public class Stack_05_UsingMethods {

	public static void main(String[] args) {
		Stack st=new Stack();
		st.push(5);//adding elements
		st.push(15);//adding elements
		st.push(25);//adding elements
		st.push(35);//adding elements //head
		
		System.out.println(st);
		
		//to see which one now at the top position--->peek()
		System.out.println(st.peek());//35
		
		System.out.println(st);
		
		//pop item
		
		st.pop(); //will be poped up top item
		
		//to see which one now at the top position--->peek()
				System.out.println(st.peek());//25

	}

}

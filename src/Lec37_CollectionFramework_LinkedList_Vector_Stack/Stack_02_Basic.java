package Lec37_CollectionFramework_LinkedList_Vector_Stack;

import java.util.Stack;

public class Stack_02_Basic {

	public static void main(String[] args) {
		
		//create a stack
		Stack st=new Stack();
		
		//adding elements
		st.add(5); //adding            //Tail
		st.addElement(10);//adding
		st.push(25);//adding            //Head
		
		System.out.println(st.size());
		
		System.out.println(st.capacity());//10
		
		//adding more items to see the capacity incrsed to 20
		st.add(5555);  
		st.addElement(1110);
		st.addElement(1110);
		st.addElement(1110);
		st.addElement(1110);
		st.addElement(1110);
		st.push(2500);
		st.push(2500);
		System.out.println("Capacity after addimg more elements:"+st.capacity());//20
		System.out.println(st);
		
		for(int i=0;i<st.size();i++) {
			System.out.println(st.get(i));
		}
		
		//we see which one is top and which is last
		System.out.println("the top item:"+st.peek());//this method will return which item at the top
		
		
		//using pop()---removing the top one
		System.out.println(st.pop());//it will remove the top
		
		//now remaining
		System.out.println("now remaining:"+st);
		
		//now removing item which one is now at top position
		System.out.println(st.pop());//it will remove the top
		//now remaining
		System.out.println("now remaining:"+st);
		
		
		//to see it is empty or not
		System.out.println(st.empty());// will return true or false
		
		
		

	}

}

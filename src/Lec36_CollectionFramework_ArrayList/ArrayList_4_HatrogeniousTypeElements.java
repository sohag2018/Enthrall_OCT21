package Lec36_CollectionFramework_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_4_HatrogeniousTypeElements {

	//Note: Here we will learn if it is raw (not generic) then we can put diff obj type
	//we can also duplicate element
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		
		//adding diff type element (hatrogenious)
		
		al.add(5);
		al.add(5.5);
		al.add(555555);
		al.add('c');
		al.add("Sohag");
		al.add("Sohag");///duplicate
	
		
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}

}

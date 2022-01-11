package Lec41_CollectionFramework_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_HashSet_01_Basic {

	public static void main(String[] args) {
		//Creating set raw type
		Set set=new HashSet();
		set.add(5);
		set.add("S");
		set.add('c');
		set.add(10008822);
		set.add(10008822);
		
		//iterator() to print all elements
		Iterator i=set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	//enhance/advanced/for each loop
	//Generic<Integer> type
		
	Set<Integer> set2=new HashSet<>();
	set2.add(5);
	set2.add(15);
	set2.add(25);
	set2.add(35);
	
	for(int s:set2) {
		
		if(s>5)//condition set to print only if more than 5
		System.out.println(s);
	}
		
	}

}

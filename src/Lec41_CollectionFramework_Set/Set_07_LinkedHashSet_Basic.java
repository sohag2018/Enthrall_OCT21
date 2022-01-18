package Lec41_CollectionFramework_Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set_07_LinkedHashSet_Basic {
	
	//In this class we will see how to create LinkedHashSet and how it implements HashTable and LinkedList implemented

	public static void main(String[] args) {
		Set<Integer> set=new LinkedHashSet<>();
		for(int i=100;i<111;i++) {
			set.add(i);
		}
		
		for(int singleSet:set) {
			System.out.println(singleSet);
		}
		
	}

}

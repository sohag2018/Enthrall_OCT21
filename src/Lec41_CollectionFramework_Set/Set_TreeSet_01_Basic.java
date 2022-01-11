package Lec41_CollectionFramework_Set;

import java.util.Set;
import java.util.TreeSet;

public class Set_TreeSet_01_Basic {

	public static void main(String[] args) {
		//creating set--generic<Integer>
		Set<Integer> s=new TreeSet<>();
		s.add(5);
		s.add(15);
		s.add(52);
		s.add(50);
		s.add(50);//duplicate
	
		//printing all elements using for each loop
		for(int single:s) {
			System.out.println(single);
		}
		
		//creating set--generic<String>
		Set<String> s1=new TreeSet<>();
		s1.add("Rafez");
		//s1.add(null);  // not possible
		s1.add("Rafez");//duplicate element will be not inserted
		s1.add("Sohag");
		
		//size checking
		System.out.println(s1.size());
		
		
	}

}

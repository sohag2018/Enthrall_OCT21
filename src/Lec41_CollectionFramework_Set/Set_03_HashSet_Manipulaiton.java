package Lec41_CollectionFramework_Set;

import java.util.HashSet;
import java.util.Set;

public class Set_03_HashSet_Manipulaiton {

	public static void main(String[] args) {
		
		//1st set
		Set<Integer> s=new HashSet<Integer>();
		s.add(5);
		System.out.println(s.size());//1

		//2nd set
		Set<Integer> s2=new HashSet<Integer>();
		for(int i=10;i<200;i++) {
			
			if(i%2==0) {
				s2.add(i);
			}
			
		}
		
//		s2.add(10);
//		s2.add(11);
//		s2.add(35);
//		s2.add(55);
		
		//using addAll() insert all in 1st set set
		s.addAll(s2);
		System.out.println("after addAll:"+s.size());//5
		
		System.out.println(s2);  //just checking s2 size
		
		//removing specific element--not index wise
		s2.remove(15);
		//printing rest from s2 
		System.out.println(s2);//3
		
		//printing all from s2 by using for each loop	
		for(int single:s2) {
			System.out.println(single);
		}
		
		//removing all from s
		s.removeAll(s2);
		System.out.println("after removingAll:"+s.size());
		
		
		//address of the obj
		System.out.println("hashcode for s obj-"+s.hashCode());//give you hashcode for s obj
		System.out.println("hashcode for s2 obj-"+s2.hashCode());//give you hashcode for s2 obj
		
	
		
		
		
	}
	
	
	

}

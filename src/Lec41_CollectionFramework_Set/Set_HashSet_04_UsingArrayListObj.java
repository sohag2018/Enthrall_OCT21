package Lec41_CollectionFramework_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_HashSet_04_UsingArrayListObj {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(5);
		list1.add(15);
		list1.add(25);
	
		
		
		ArrayList<Integer> list2=new ArrayList<>();
		list2.add(50);
		list2.add(150);
		list2.add(250);
		
	//	Set<ArrayList> s=new TreeSet<>();------> not possible
		Set<ArrayList> s=new HashSet<>();
		s.add(list1);  
		s.add(list2);
		
		System.out.println(s.size()); 
		
		//so we have only one ArrayList Obj
		for(ArrayList single:s) {
			for(int i=0;i<single.size();i++) {
				System.out.println(single.get(i));
			}
			
			}
			
			
		}
		
		
		
		
		

	}



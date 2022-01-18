package Lec41_CollectionFramework_Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set_08_LinkedHashSet_Features {
	//In this class we will create a generic LinkedHashSet and see how it maintains insertion order by printing 
	//then we will create another linkedHashSet and check unique elements only, null elements is permitted

	public static void main(String[] args) {
		
		Set<String> set=new LinkedHashSet<>();
		
		
		//See the insertion order
		set.add("Sohag");
		set.add("Rafez");
		set.add("Anik");
		set.add("Kanta");
		
		//size
		System.out.println(set.size());
		
		for(String singleEle:set) {
			System.out.println(singleEle);
		}

		
Set<String> set1=new LinkedHashSet<>();
		
		
		//See the insertion order
		set1.add("S");
		set1.add("S");//duplicate
		set1.add(null);
		set1.add("Kanta");
		
		//size
		System.out.println(set1.size());//3
		
		for(String singleEle1:set1) {
			System.out.println(singleEle1);
		}

	}

}

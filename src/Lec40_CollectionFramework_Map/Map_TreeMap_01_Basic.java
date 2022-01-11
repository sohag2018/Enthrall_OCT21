package Lec40_CollectionFramework_Map;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Map_TreeMap_01_Basic {

	public static void main(String[] args) {
		
		//creating map implementing by TreeMapClass--to add elements
		//Key<Integer> and Value<String>
		Map<Integer,String>tm=new TreeMap<>();
		tm.put(104, "Noyon");
		//tm.put(101, "Noyon");//duplicate not allowed
		tm.put(102, "");
		tm.put(109, "Sohag");
		tm.put(105, "Farhan");
		tm.put(101, "Khaleda");
		//print the size of the map
		System.out.println(tm.size());
				
		//using single key--value print
		System.out.println(tm.get(101));
		
		//print all keys---values (this time keyset used directly in for each loop
		for(int key:tm.keySet()) {
			System.out.println(tm.get(key));
		}
		
		
		//2nd map--(treemap)--Key<String> and Value<Integer>
		Map<String, Integer> map=new TreeMap<>();
		map.put("Sohag", 5);
		map.put("Rahman", 15);
		map.put("Ryhan", 50);
		
		
		//using keySet() getting all keys and using for each loop by iterating each key print all values
		Set <String> allKeys=map.keySet();
		for(String singleKey:allKeys) {
			System.out.println("Value for:"+singleKey+":"+map.get(singleKey));
		}
		
		
		
		
		
		

	}

}

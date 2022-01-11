package Lec40_CollectionFramework_Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Map_LinkedHashMap_01_Basic {

	public static void main(String[] args) {
		
		//Crearing map implementing by LinkedHashMap
		//every key will be getting inserted in HashTable(specific indes based on hashcode) along with value and next and prev node link
		Map<Integer,String> lhmap=new LinkedHashMap<>();
		lhmap.put(5, "S5");
		lhmap.put(4, "S4");//index 4
		lhmap.put(3, "S3");
		lhmap.put(2, "S2");
		lhmap.put(1, "S1");
		
		//taking all keys---keyset
		Set<Integer> keys=lhmap.keySet();
		//check all keys:
		System.out.println(keys); //[5, 4, 3, 2, 1]
		
		//using keyset print all corresponding values
		for(int key:keys) {
			System.out.println(lhmap.get(key));
		}
		
		
		
	}
	
	
	

}

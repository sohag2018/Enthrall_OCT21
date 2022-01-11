package Lec40_CollectionFramework_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_HashMap_03_returnvalue {

	public static void main(String[] args) {
		
		//Creating map Key-Sring  value-String
		Map<String,String> map=new HashMap<>();
		map.put("S", "NY");
		map.put("K", "NJ");
		map.put("M", "LA");
		map.put("N", "CT");
		
		//using single key---->for value
		System.out.println(map.get("N"));//internally it will call hascode()---give you same hashcode//1000001
		
		//keySet---taking all keys
		Set<String> keys=map.keySet(); //[S, K, M, N]
		System.out.println(keys);
		
		//prin all values using keyset
		for(String k:keys) {
			
			System.out.println(map.get(k));
		}
		
		

	}

}

package Lec40_CollectionFramework_Map;

import java.util.HashMap;
import java.util.Map;

public class Map_HashMap_02_Basic {

	public static void main(String[] args) {
		
		//creating map---Key as String and Value as Integer:
		Map <String,Integer> map=new HashMap<>();
		map.put("S",101);//internally it will call hashCode()----> will give you a hascode (int number)
		map.put("Y",102);
		map.put("P",103);
		map.put("",103);//single null key is possible
		map.put("",104);//duplicate not possibel
		map.put("Mukta1",0);//duplicate key is not possible 
		map.put("Kanta2",0);//duplicate value possble
		map.put("Kanta2",103);
		map.put("Kanta5",103);
		map.put("Kanta6",103);
		map.put("Kanta7",103);
		map.put("Kanta8",103);
		map.put("Kanta9",103);
		map.put("Kanta10",103);
		map.put("Kanta11",103);
		map.put("Kanta12",103);
		map.put("Kanta13",103);
		map.put("Kanta14",103);
		map.put("Kanta15",103);
		map.put("Kanta16",103);
		map.put("Kanta17",103);
		//when initally capaciyt is 16-indexes but when threshold (12) exceeds capacity will be double-32 indexes
		System.out.println(map.size());

	}

}

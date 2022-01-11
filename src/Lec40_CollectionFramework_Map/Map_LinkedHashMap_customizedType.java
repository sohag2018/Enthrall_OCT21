package Lec40_CollectionFramework_Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//We will create some obj of our own made class and then used those obj as value for our map
//fo first create a class as "EnthrallIT2ndBatch" and get value for name variable through constructor when obj created
//check in same package EnthrallIT2ndBatch Class created

public class Map_LinkedHashMap_customizedType {

	public static void main(String[] args) {
		
		
		//creating obj of our ownclass-EnthrallIT2ndBatch type so we can pass as value
		
		EnthrallIT2ndBatch st1=new EnthrallIT2ndBatch("Mukta");	
		EnthrallIT2ndBatch st2=new EnthrallIT2ndBatch("Noyon");
		EnthrallIT2ndBatch st3=new EnthrallIT2ndBatch("Farhana");
		
		

		//creating map (implemented by LinkedHashMap) to pass key<Integer> and value<EnthrallIT2ndBatch>
		Map<Integer,EnthrallIT2ndBatch> lhmap=new LinkedHashMap<>();
		
		lhmap.put(101, st1);
		lhmap.put(102, st2);
		lhmap.put(103, st3);
		
		
		//taking all keys--keyset
		Set<Integer> rollNumbers=lhmap.keySet();
		//by using keyset getting all values corresponding with key  and finally print all name varibles value by using that value (obj of our ownclass type)
		for(int roll:rollNumbers) {
			System.out.println("Roll:"+roll+" Name:"+lhmap.get(roll).name);	
		}
		
		

	}

}

package Lec41_CollectionFramework_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_04_HashSet_ContainsMethodLogic {

	public static void main(String[] args) {
		Set<String> s=new HashSet<>();
		s.add("Rafez");
		s.add("Noyon");
		s.add("Onik");
		s.add("Ryhan");
		s.add("Khaleda");
		s.add("Mukta");
	
		if(!s.contains("Rafez")) {
			System.out.println("Rafez will record class session");
		}else {
			System.out.println("Please someone take this responisblity");
		}

		//2nd program
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next()+": got the job");	
		}
		
		
		
		//for() {}
		
		//System.out.println(s.isEmpty());
		
		if(s.isEmpty()) {
			System.out.println("No body got job:");
			
		}else {
			
			s.remove("Rafez");
			System.out.println("Ragfez got the job");
			System.out.println("Remaining job seeker:"+s);
		}
		
		
		
	}

}

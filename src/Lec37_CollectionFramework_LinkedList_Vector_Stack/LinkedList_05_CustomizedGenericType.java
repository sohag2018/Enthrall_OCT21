package Lec37_CollectionFramework_LinkedList_Vector_Stack;

import java.util.LinkedList;

public class LinkedList_05_CustomizedGenericType {
	
	//Note: Here we will crate LinkedList as our own (customized) type---->EnthrallITMentors type
	//so we need to create a class so that we can make <EnthrallITMentors> type---lets create a class

	public static void main(String[] args) {
		LinkedList<EnthrallITMentors> cLink=new LinkedList<>();
		
		//Now we need to create some obj of EnthrallITMentors type	
		EnthrallITMentors m1=new EnthrallITMentors("Sohag");
		EnthrallITMentors m2=new EnthrallITMentors("Nasir");
		EnthrallITMentors m3=new EnthrallITMentors("Lobid");
		EnthrallITMentors m4=new EnthrallITMentors("Tofyel");
		
		
		//now we can add these obj as our elements in LinkedList
		cLink.add(m1);
		cLink.add(m2);
		cLink.add(m3);
		cLink.add(m4);
		
		//size of the linkedList
		System.out.println(cLink.size());
		//pring from last
		for(int i=cLink.size()-1;i>=0;i--) {
			System.out.println(cLink.get(i).name);
			
		}
		
		for(int i=0; i<cLink.size(); i++ ){
			System.out.println(cLink.get(i).name);
			
		}
		
		
		

	}

}

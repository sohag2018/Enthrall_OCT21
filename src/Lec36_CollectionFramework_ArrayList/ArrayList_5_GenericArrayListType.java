package Lec36_CollectionFramework_ArrayList;

import java.util.ArrayList;

public class ArrayList_5_GenericArrayListType {
	
	
	//Note: here will see how we can make generic type like <String> , <Integer> etc type
	//Please remember you cant put diff type only....generic type (which type we declare)

	public static void main(String[] args) {
		
		//making Integer type (generic)
		ArrayList<Integer> intArray=new ArrayList<>();
		intArray.add(5);
		intArray.add(15);
		intArray.add(25);
		intArray.add(65);
		
		
		//making String type (generic)
		ArrayList<String> sArray=new ArrayList<>();
		sArray.add("Noyon");
		sArray.add("");
		sArray.add("Fatima");
		sArray.add("Sohag");
		sArray.add("Noyon");
		
		for(String name:sArray) {
			System.out.println(name);
		}
		
		
	}

}

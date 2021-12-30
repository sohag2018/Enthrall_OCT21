package Lec36_CollectionFramework_ArrayList;

import java.util.ArrayList;

public class ArrayList_3_ManupulationOfData {
	
	//Note: Here we will see some data manipulations
	
		public static void main(String[] args) {
			//creating arraylist and adding elements
		ArrayList al=new ArrayList();
		al.add(5);
		al.add(15);
		al.add(25);
		
		//print by using get()
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		//add in specific position
		al.add(1,55);
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		// see the posiution of specific element
		System.out.println("position"+al.indexOf(55));
		
		
		//removing elements from specific position
		al.remove(1);
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		//having another arraylist to add prev arrayList's elements in it
		ArrayList al1=new ArrayList();
		al1.add(105);
		al1.add(110);
		
		
		System.out.println("2nd arrayList elements");
		for(int j=0;j<al1.size();j++) {
			System.out.println(al1.get(j));
		}
		
		//adding prev arrayList elements
		
		al1.addAll(al);
		
		System.out.println("2nd arrayList elements after addAll");
		for(int k=0;k<al1.size();k++) {
			System.out.println(al1.get(k));
		}
		
		
	/*	al1.removeAll(al);
		System.out.println("2nd arrayList elements after removeAll");
		for(int m=0;m<al1.size();m++) {
			System.out.println(al1.get(m));
		}
		*/
		
	//retainAll---it will remove elements from specicic obj which are not in (passing) obj
		
		al1.retainAll(al);
		System.out.println("2nd arrayList elements after retainAll");
		for(int m=0;m<al1.size();m++) {
			System.out.println(al1.get(m));
		
		
		
		
		
		
		

	}

}}

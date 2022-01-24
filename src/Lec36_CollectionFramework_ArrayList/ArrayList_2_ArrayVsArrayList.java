package Lec36_CollectionFramework_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_2_ArrayVsArrayList {
	
	//Note: here we will see diff between Array and ArrayList--how to create, how to add, print etc

	public static void main(String[] args) {
		//Array
		int[]arr=new int[5];
		arr[0]=5;
		arr[1]=25;
		arr[2]=25;
		//arr[0]="Sohag";  not possible
		
		//size
		System.out.println(arr.length);
		
		//print
		
		System.out.println(arr[0]);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		//iterator()  not possibel for Array
		
		
		System.out.println("---------by using for each loop/advance");
		
		for(int a:arr) {
			
			System.out.println(a);
		}
		
		//ArrayList
		ArrayList<Integer> al=new ArrayList<>(12);  //by using default constructor--initial capacity is 10 +5 =15 21 --	//for capacity please check info class  
		
		al.add(5);
		al.add(15);
		al.add(25);
		al.add(35);
		al.add(55);
		al.add(65);
		al.add(5);
		al.add(5);
		al.add(5);
		al.add(5);
		al.add(50);
		al.add(5);
		
		
		
		
		
		//this is not capacity--it is size of the arraylist
		System.out.println("Size of the arrayList is:"+al.size());
		
		//print
		System.out.println("---------by using single index in get()");
		System.out.println(al.get(1));
		
		System.out.println("---------by using for loop");
		for(int j=0;j<al.size();j++) {
			System.out.println(al.get(j));
		}
		
		//iterator()
		
		System.out.println("---------by using iterator()");
		
		Iterator it=al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("---------by using for each loop/advance");
		
		for(int a:al) {
			
			System.out.println(a);
		}
		
		
	}

}

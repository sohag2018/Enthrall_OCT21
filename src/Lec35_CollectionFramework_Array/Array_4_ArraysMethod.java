package Lec35_CollectionFramework_Array;

import java.util.Arrays;

public class Array_4_ArraysMethod {

	public static void main(String[] args) {
		int[] array1=new int[3];
		array1[0]=550;
		array1[2]=150;
		array1[1]=250;
		
	/*	for(int i=0;i<array1.length;i++) {
			System.out.println(array1[i]);
		} */
		
		//toString method from Arrays class
		System.out.println(array1);
		System.out.println(Arrays.toString(array1));
		
		
		//to sort the value--> to find the smallest number 
		
	//	Arrays.sort(array1);
			
		
		for(int i=0;i<array1.length;i++) {
		System.out.println(array1[i]);
	} 
		
		
		int [] b=Arrays.copyOf(array1, 10); //in first arug=old array. 2nd arg=new size of array
		
		b[3]=5;
		b[4]=55;
		b[5]=55;
		b[6]=59;
		
		System.out.println(b[0]);
		
		System.out.println(Arrays.hashCode(array1));
		System.out.println(Arrays.hashCode(b));
		
		
	}

}

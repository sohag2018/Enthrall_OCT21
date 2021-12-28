package Lec35_CollectionFramework_Array;

import java.util.Random;
import java.util.Scanner;

public class Array_7_inputApproach {

	public static void main(String[] args) {

		int[] a=new int[10];
	/*	
		
		//by using for loop
		for(int i=0;i<100;i++) {  
			a[i]=i+5;  //how it will work-->a[0]=0+5=5;
			System.out.println(a[i]);
		}
		
		*/
		//by scanner class
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.println("Please insert your int");
			a[i]=sc.nextInt();	
			
		}
		
		for(int j=0;j<9;j++) {
			
			System.out.println(a[j]);
		}
		/*
		Random r=new Random();
		
		for(int j=0;j<10;j++) {
			a[j]=r.nextInt(100);  //up to 100
		}
		
		
		
		for(int j=0;j<10;j++) {
			
			System.out.println(a[j]);
		}
		*/
	
		

	}

}

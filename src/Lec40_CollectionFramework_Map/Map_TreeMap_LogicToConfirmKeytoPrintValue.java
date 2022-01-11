package Lec40_CollectionFramework_Map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Map_TreeMap_LogicToConfirmKeytoPrintValue {
//using containsKey()---checking key is there or not and then proceed for program
	
	public static void main(String[] args) {
		
		//crating treeMap obj and add key and value for making student's resultsheet
		Map<Integer,String> map=new TreeMap<>();
		map.put(1001, "Pass");
		map.put(1002, "Pass");
		map.put(1003, "Fail");
		map.put(1004, "Pending");
		map.put(1005, "Should Retake");
		
		//System.out.println(map.get(1001));
		
		//by logic you are searching a specific key's value--student's result	
		
		//passing command to get input from keyboard
		System.out.println("Please put your roll number to get your result");
		Scanner sc=new Scanner(System.in);
		//input storing in variable
		int searchInput=sc.nextInt();

		//System.out.println(map.get(searchInput));
		//by using if--else block checking key exists in our map or not
		if(map.containsKey(searchInput)) {
			System.out.println("Your result for "+searchInput+" is: "+map.get(searchInput));//if exists then print this line
		}else{System.out.println("Please insert correct roll number");}//if doesnt exist then print this line
		
		
		

	}

}

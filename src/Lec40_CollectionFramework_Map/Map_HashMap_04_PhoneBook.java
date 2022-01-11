package Lec40_CollectionFramework_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Map_HashMap_04_PhoneBook {

	public static void main(String[] args) {
		//creating map--Key as String and value as Integer--to make a contact list
		Map<String,Integer> phoneNumber=new HashMap<>();
		phoneNumber.put("Noyon", 64646464);
		phoneNumber.put("Mukta", 555555);
		phoneNumber.put("Sohag", 64648164);
		phoneNumber.put("Kanta", 85466888);
		
		//Sent command to give input from keyboard
		System.out.println("Insert student's name to get the phone number");
		Scanner sc= new Scanner(System.in);
		//storing input variable which is receiving by nextLine()
		String st=sc.nextLine();		
		//Print the value from contact list by using key passed by user through keyboard
		System.out.println(phoneNumber.get(st));

	}

}

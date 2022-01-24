package Lec36_CollectionFramework_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_6_CustomizedClassType {

	public static void main(String[] args) {
		
		//Note: as we are creating our own EnthrallStudents type--so first we need to create a class EnthrallStudents 
		//then we will create obj of that class to put in arraylist. So check EnthrallStudents class has been created in same package
		
		//creating arraylist
		ArrayList<EnthrallStudents> cl=new ArrayList<>();
		
		//as we need obj of EnthrallStudents type--so we ae creating obj of EnthrallStudents class
		//we are passing Name (String) through contractor
		EnthrallStudents st1=new EnthrallStudents("Rafez",25,'M');
		EnthrallStudents st2=new EnthrallStudents("Noyon",27,'M');
		EnthrallStudents st3=new EnthrallStudents("Fatima",19,'F');
		EnthrallStudents st4=new EnthrallStudents("Onik",26,'M');
		
		//we created 4 objs--now adding in arraylist
		cl.add(st1);
		cl.add(st2);
		cl.add(st3);
		cl.add(st4);
		
		
		//checking size of the arrayList
		System.out.println(cl.size());
		
		//Printing name varibale value which available in every obj--so first grab the obj then calling name
		//option-1: using for each loop
		for(EnthrallStudents student:cl) {
			System.out.println(student.studentName);//after grabing each elements (obj)--calling name variable to print
		}
		
		//option-2: using for loop
		System.out.println("------------using for loop()");
		
		for(int i=0;i<cl.size();i++) {
			System.out.println(cl.get(i).studentName);//after grabing each elements (obj)--calling name variable to print
			
		}
		//option-3: by using iterator()
		System.out.println("------------using iterator()");
		
		Iterator it=cl.iterator();
		while(it.hasNext()) {
			EnthrallStudents students=(EnthrallStudents) it.next();
			System.out.println(students.studentName);//after grabing each elements (obj)--calling name variable to print
		}
		
		
		
		
		

	}

}

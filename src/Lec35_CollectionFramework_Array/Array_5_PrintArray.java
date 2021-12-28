package Lec35_CollectionFramework_Array;

public class Array_5_PrintArray {

	public static void main(String[] args) {
		String students[]=new String[5];
		students[0]="Sohag";
		students[1]="Ryhan";
		students[2]="Fatima";
		students[3]="sssss";
		students[4]="yyyy";
		
		
		System.out.println(students.length); //5
		
		//by index number
		System.out.println(students[0]);
		
		//by using for loop
		for(int i=students.length-1;i>0;i--) {
			System.out.println(students[i]);
		}
		
		//by using for each/advanced loop
		
		for(String s:students) {
			System.out.println(s);
		}
		
		//While loop
		
		int j=0;
		while(j<5) {
			System.out.println(students[j]);
			j++;
		}
		
		//interview q diff between while loop and do while loop
		
		//do while loop
		int k=0;
		do {System.out.println(students[k]);
		k++;
		
		}
		while (k<5);
	}

}

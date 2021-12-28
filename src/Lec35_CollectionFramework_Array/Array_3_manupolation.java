package Lec35_CollectionFramework_Array;

public class Array_3_manupolation {

	public static void main(String[] args) {
		int in[]=new int[5];	
		in[0]=25;
		in[1]=58;
		in[2]=55;
		in[3]=15;
		in[4]=5;
		
		System.out.println(in[0]); //25
		
		
		
		//replacing value
		in[0]=500;
		System.out.println(in[0]); //500
		for(int i=0;i<5;i++) {
			System.out.println(in[i]);
		}
		
		
		
		String student[]=new String[3];
		student[0]="Sohag";
		student[1]="Rayhan";
		student[2]="Sadia";
		
		for(int i=0;i<3;i++) {
			System.out.println(student[i]);
		}
		
		student[0]="Shohagh";
		for(int i=0;i<3;i++) {
			System.out.println(student[i]);
		}
		
		

	}

}

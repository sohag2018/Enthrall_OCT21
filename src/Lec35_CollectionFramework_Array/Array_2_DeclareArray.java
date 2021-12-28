package Lec35_CollectionFramework_Array;

public class Array_2_DeclareArray {

	public static void main(String[] args) {
		//declare int array
		int[] a=new int[5];
		a[0]=1115;
		//a[1]="Ryhan"; 
		a[3]=35;
		a[4]=3;
		
		
		System.out.println(a[4]);
		System.out.println(a[1]);
		System.out.println(a[0]);
		System.out.println(a[4]);
		System.out.println(a[4]);
		
		//declaring Sting type array
		String[] b=new String[2];
		b[0]="Ryhan";
		b[1]="Noyon";
		
		
		//to see the size of the array:
		System.out.println(a.length);
		
		
		//literal presentation of array-declaring array
		
		int [] c= {2,8,100}; //declaring & putting values in indexc
		
		System.out.println(c.length);
		
		System.out.println(c[2]); //100
		
		
		
		
		
		
		

	}

}

package Lec35_CollectionFramework_Array;

public class Array_6_MultiDimention {

	public static void main(String[] args) {
		//1d array
		
		int[]a=new int[3];
		a[0]=5;
		
	/*	for(int i=0;i<3;i++) {
			System.out.println(a[i]);
		}

		*/
		//2d
		
		int[][]a1=new int[4][5];
		a1[0][0]=20;
		a1[0][1]=21;
		a1[0][2]=15;
		a1[1][0]=102;
		a1[1][1]=122;
		a1[1][2]=162;
		
		
		//if we print index wise (first one for row and 2nd one for column)
		System.out.println(a1[0][1]);
		
		
		//if we print all--->outer loop for row and inner loop for column
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(a1[i][j]);
				
			}
		}

		
		
		
	}

}

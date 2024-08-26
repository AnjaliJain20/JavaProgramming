package Day6Array;
/*1. Declare an Array
 *2. Insert value into array
 *3. Find size of an array
 *4. Read Single values from an array
 *5.Read multiple values from an array
 */
public class TwoDimensionArray {

	public static void main(String[] args) {
		
		//Approach 1
		/*int a[][]=new int[3][2];
	  //int[][]b=new int[3][2];
	  //int []c[]=new int [4][8];
			
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;
		
		System.out.println(a[2][1]);*/
		
		//Approach 2
		
		int a[][]= {{100,200},{300,400},{500,600}};
		//int a[][]= {{100,200},
		//            {300,400},
		//            {500,600}};
		
		//Length of an array
		//System.out.println(a.length);//3-- Row
		//System.out.println(a[0].length);//2-- Column----> column value of particular row
		
		// Read Specific from an array
		
		//System.out.println(a[2][1]);
		
		// Read all the array values using For Loop
		
		/*for(int i=0;i<a.length;i++)//         i=0,0<3                        i=1,1<3                    i=2,2<3            i=3,3<3
		{
			for (int j=0;j<a[i].length;j++)// j=0,0<2     j=1,1<2 j=2,2<2    j=0,0<2  j=1,1<2  j=2,2<2  0<2   1<2   2<2
				                           //                                                             
			{
				System.out.print(a[i][j]+" ");//a[0][0]=100  a[0][1]=200    a[1][0]=300  a[1][1]=400    a[2][0]=500 a[2][1]=600
			}
			System.out.println();
		}*/
		
		// Read all the array values using enhanced for loop
		
		for (int x[]:a)                 // x[]=100,200   x[]=300,400  x[]=500,600
		{
			for (int y:x)               // y=100  y=200  y=300 y=400  y=500  600
			{
				System.out.print(y+" ");// 100    200    300  400     500 600  
			}
			System.out.println();
		}
		
		
		
		

	}

}

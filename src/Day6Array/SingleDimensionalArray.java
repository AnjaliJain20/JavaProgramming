package Day6Array;

import java.util.Arrays;

/*1. Declare an Array
 *2. Insert value into array
 *3. Find size of an array
 *4. Read Single values from an array
 *5.Read multiple values from an array
 */
public class SingleDimensionalArray {

	public static void main(String[] args) {
		// 1. Declaration of an array 2.Insert value into array
		//Approach 1
		/*int a[]=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		//** When you have limited elements and in future you don't want to add more value or decrease any value. Go with the Approach 1.
		
		*/
		
		//Approach 2
		int a[]= {100,200,300,400,500};
		//** When you have to increase or decrease the values in array. when the size is not fixed. Go with the Approach2.
		
		//3.Find size/length of an array
	    //	System.out.println(a.length);
		
		//4. Get single value from an array/ Read single value from an array 
		//System.out.println(a[0]);
		
		//5.Read multiple values from an array/get multiple values from an array
		//Approach1
		//System.out.println(Arrays.toString(a));//not use most if the time
		
		//Approach2
		//print the array element one by one using loop
		
		//for(int i=0;i<=a.length-1;i++)
	  	//{
			//System.out.println(a[i]);
			
		//}
		
		//Approach 3
		//print the array element one by one using loop
		
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
		
		
		
		
		
	}

}

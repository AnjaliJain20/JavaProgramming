package Practice;

import java.util.Scanner;

public class PerfectNumber 
{

	public static void main(String[] args)
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		num= sc.nextInt();
		int temp=num;
		int Perfect=0;
		System.out.println("Number is");
		int i=1;
		while(i<=num/2) 
		{
			if(num%i==0)
			{
				Perfect=Perfect+i;
				
			}
			i++;
			

	}
		if (temp==Perfect) {
		System.out.println("Number is perfect number"+Perfect);
		}
		else
		{
			System.out.println("Number is not perfect number"+Perfect);
		}
}
}

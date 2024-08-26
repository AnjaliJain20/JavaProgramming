package Practice_1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number");
	    int a =sc.nextInt();
	    int count=0;
	    for(int i=1;i<=a;i++)
	    {
	    	if(a%i==0)
	    	{
	    		count++;
	    	}
	    }
	    if(count==2)
	    {
	    	System.out.println("number is prime"+a);
	    }
	    
	    else
	    {
	    	System.out.println("not prime"+a);
	    }

	}

}

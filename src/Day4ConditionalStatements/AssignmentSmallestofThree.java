package Day4ConditionalStatements;

public class AssignmentSmallestofThree 
{

	public static void main(String[] args) 
	{
		int a=1,b=9,c=0;
		
		if(a<b&&a<c) 
	    System.out.println("A is the smallest number:"+a);
		
		else if(b<a&&b<c)
		System.out.println("B is the smallest number:"+b);
		
		else
		System.out.println("C is the smallest number:"+c);	
	}
}	
	
		
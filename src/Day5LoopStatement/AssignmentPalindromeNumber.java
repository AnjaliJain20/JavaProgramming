package Day5LoopStatement;

public class AssignmentPalindromeNumber 
{

	public static void main(String[] args)
	{
		int num=989,rev=0,rem=0;
		int temp=num;
		System.out.println("Number is: "+num);
		//Approach 1
		while(num>0)
		{
			rev=rev*10+num%10;// 0+9=9 90+8=98  980+9=989
			num=num/10;// 98           // 98/10=9  9/10=0
		}
		
		if(temp==rev)			
		    System.out.println("Number is Palindrome :"+temp);		
		else			
			System.out.println(" Number is not Palindrome :"+temp);		
	}
	
}

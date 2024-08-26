package Day5LoopStatement;

public class AssignmentCountEvenOddDigit 
{

	public static void main(String[] args) 
	{
		int num=8876875,rem;
		int even_count=0,odd_count=0;
		while(num>0)
		{
			rem=num%10;
			if(rem%2==0)
			{ 
				even_count++;
			}
			else 
			{
				odd_count++;
			}
			
			num=num/10;
			
		}
		System.out.println("Number of even digits are : "+even_count);
		System.out.println("Number of odd digits are : "+odd_count);
		
	}

}

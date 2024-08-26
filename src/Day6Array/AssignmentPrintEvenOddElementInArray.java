package Day6Array;

public class AssignmentPrintEvenOddElementInArray {

	public static void main(String[] args) {
		int EvenCount=0,OddCount=0;
		int a[]= {1,2,3,4,5};
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2==0)
			{
				
				EvenCount++;
			}
			else
			{
				
				OddCount++;
			}
		}
	  System.out.println("Even count of an array is: "+EvenCount);
	  System.out.println("Odd count of an array is: "+OddCount);

	}

}

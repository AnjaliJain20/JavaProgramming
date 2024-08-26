package Practice;

public class FindEvenOddCount {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int even=0,odd=0;
		for (int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("The even numbers in an array are:"+even);
		System.out.println("The odd numbers in an array are:"+odd);
	}

}

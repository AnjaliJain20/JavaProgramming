package Practice;

public class PrimeNumberFromAnArray {

	public static void main(String[] args) {
		int arr[]= {5,2,3,11};
		int count=0,i;
		for(i=0;i<=arr.length-1;i++)
		{
			for(int j=2;j<=arr[i];j++) {
			if(arr[i]%j==0)
			{
				count++;
			}
		}
		}
		if(count==2)
		{
			System.out.println(arr[i]);
		}
        System.out.println();
	}

}

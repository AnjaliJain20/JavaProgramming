package Practice_1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n1=0, n2=1,n3,count=10;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=3;i<=count;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
		}
		
		
	}

}

package Practice;

public class SumOfDigit {

	public static void main(String[] args) {
		int num=14,rem=0,sum=0;
	    while(num!=0)
	    {
	    	rem=num%10;
	    	sum=sum+rem;
	    	num=num/10;
	    }
	    System.out.println(sum);

	}

}

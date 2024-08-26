package Practice;

public class ReverseNumber {

	public static void main(String[] args) {
		int num=198;
		int rem=0,rev=0;
		
		System.out.println("The number is:"+num);
		
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("The reverse number is: "+rev);

	}
	

}

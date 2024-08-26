package Practice;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=123;
		int rem=0,rev=0;
		int temp=num;
		
		System.out.println("The number is: "+num);
		
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		
		if(rev==temp)
		{
			System.out.println("Number is palindrome number"+rev);
		}
		else
			System.out.println("Number is not palindrome number"+rev);

	}

}

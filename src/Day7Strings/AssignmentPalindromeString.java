package Day7Strings;

public class AssignmentPalindromeString {

	public static void main(String[] args) {
		String s="MAM";
		String str=s;
		String rev="";
		char a[]=str.toCharArray();
		//System.out.println(a);
		
		int len=str.length();
		
		for(int x=len-1;x>=0;x--)
		{
			rev=rev+a[x];
		}
		
		if (s.equals(rev))
		{
			System.out.println("String is Palindrome: "+rev);
		}
		else
		{
			System.out.println("String is not Palindrome: "+rev);
		}
		
			

	}
	

}

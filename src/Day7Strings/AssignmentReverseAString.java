package Day7Strings;

public class AssignmentReverseAString {

	public static void main(String[] args) {
		String s="abcd";
		String rev="";
		
		//Using CharArray method
		
		char a[]=s.toCharArray(); // a b c
		for(int x=0;x<a.length;x++) {
		System.out.println(a[x]);
		}
		int len=a.length;// length starts from 1  abcd->1,2,3,4
		System.out.println("Length of a string is: "+len);
		
		for(int i=len-1;i>=0;i--)// index starts from 0  abcd-> 0 1 2 3   i=4-1=3 3>=0  i=2 2>=0  i=1 1>=0 i=0 0>=0
		{
		   rev=rev+a[i];// rev= 0+d=d  d+c=dc  dc+b=dcb dcb+a=dcba
		}
		
		//System.out.println("The reverse string is :"+rev); //dcba
		
		
		//using String buffer method
		
		StringBuffer sb=new StringBuffer(s);
		//System.out.println(sb.reverse());
		
		// using string builder method
		
		StringBuilder str=new StringBuilder(s);
		System.out.println(str.reverse());
		
		

	}

}

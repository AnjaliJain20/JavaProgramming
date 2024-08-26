package Day7Strings;

public class EqualsAndDoubleEqualtoComparision {

	public static void main(String[]args)
	{
		//Case 1
		/*String s1="welcome";
		String s2="welcome";
		
		System.out.println(s1==s2);       //true
		System.out.println(s1.equals(s2));//true*/
		
		//case 2
		
		String s1=new String("welcome");
		String s2=new String("welcome");
		
		System.out.println(s1);      
		System.out.println(s2);
		
		System.out.println(s1==s2);       //false     //compare object
		System.out.println(s1.equals(s2));//true      //compare value of object
		
		
		
		
		
	}
}

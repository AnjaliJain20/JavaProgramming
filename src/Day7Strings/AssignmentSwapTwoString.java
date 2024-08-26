package Day7Strings;

public class AssignmentSwapTwoString {

	public static void main(String[] args) {
		String s1="abcd";
		String s2="wxyz";
		
		System.out.println("before swapping the value of string one is:"+s1);
		System.out.println("before swapping the value of string two is:"+s2);
		String Swap="";
		
		Swap=s1;
		s1=s2;
		s2=Swap;
		
		System.out.println("After swapping the value of string one is: "+s1);
		System.out.println("After swapping the value of string two is: "+s2);
		
		
		
		

	}

}

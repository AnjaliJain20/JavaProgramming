package Day5LoopStatement;

public class AssignmentReverseNumber {

	public static void main(String[] args) {
		int num=987,rev=0,rem=0;
		//Approach 1
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse number is: "+rev);
		
		//Approach 2
		
		/*while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse number is: "+rev);*/

	}

}

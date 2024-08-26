package Day5LoopStatement;

public class AssignmentFindTheSumOfDigit {

	public static void main(String[] args) {
		int num=123476574;
		int sum=0,rem;
		while(num>0)//1234>0
		{
			rem=num%10; //1234%10=4    123%10=3   12%10=2   1%10=1
			sum=sum+rem;//0+4=4       4+3=7        7+2=9    9+1=10
			num=num/10;//1234/10=123  123/10=12    12/10=1   
		}
		System.out.println("Sum of the digits are:"+sum);//10
		

	}

}

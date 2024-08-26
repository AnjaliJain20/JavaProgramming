package Day4ConditionalStatements;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		
		int a=100,b=200,c=300;
		if(a>b&&a>c)
		{
			System.out.println("A is the largest number:"+a);
		}
		else if(b>a&&b>c)
		{
			System.out.println("B is the largest number:"+b);
		}
		else
		{
			System.out.println("C is the Largest number:"+c);
		}

	}

}

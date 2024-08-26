package Day3Operators;

public class AssignmentSwappingTwoNumbers {

	public static void main(String[] args) {
		
		//Scenario 1: Using third variable
		int a=10,b=20,temp;
		
		System.out.println("Before swapping the values are a and b are: "+a+" "+b);
		//temp=a;//temp=10
		//a=b;//a=20
		//b=temp;
		//System.out.println("After swapping the value of a is :"+a+" "+"After swapping the value of b is:"+b);
		
		//Scenario 2:Without using 3rd variable:  Using Addition and subtraction operators
		 
		 // a=a+b;//x=30
		 //b=a-b;//x=30-20=10
		 //a=a-b;//30-10=20
		 //System.out.println("After swapping the value of a is:"+a);
		 //System.out.println("After swapping the value of b is:"+b);
		 
		 //Scenario 3:Without using 3rd variable: Using multiplication and Division
		/*a=a*b;//a=10*20=200
		b=a/b;//b=200/20=10
		a=a/b;//a=200/10=20
		System.out.println("After swapping the value of a is:"+a);
		System.out.println("After swapping the value of b is:"+b);*/
		
		//Scenario 4: Single statement
		b=a+b-(a=b);
		//a=b-->a=20
		//b=a+b=10+20=30
		//b=30-20=10
		System.out.println("After swapping the value of a is:"+a);
		System.out.println("After swapping the value of b is:"+b);
		
		 
		
		
		 
		 
	}

}

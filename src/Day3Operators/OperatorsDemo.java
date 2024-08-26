package Day3Operators;

public class OperatorsDemo {

	public static void main(String[] args) {
		// Arithmetic Operator
		int a=20,b=10;
		System.out.println("Sum of a and b is: "+a+b);
		System.out.println("Sum of a and b is: "+(a+b));
		System.out.println("Sum of a and b is: "+ " "+(a+b));
		
		System.out.println("Diff of a and b is: "+(a-b));
		System.out.println("Multi of a and b is: "+(a*b));
		System.out.println("Divi of a and b is: "+(a/b));
		System.out.println("Modulo of a and b is: "+(a%b));
		
		//Relational/comparison operator
		   //return true/false boolean values
		
		System.out.println(a>b);//true
		System.out.println(a<b);//false
		
		b=20;
		System.out.println(a>=b);//true a=b(at least one is true)
		System.out.println(a<=b);//true a=b(at least one is true)
		
		System.out.println(a!=b);//false
		System.out.println(a==b);//true
		
		//Logical operator
		 //works between 2 or more boolean values 
		 ////return true/false boolean values
		
		
		boolean x=true;
		boolean y=false;
		System.out.println(x&&y);//false
		System.out.println(x||y);//true
		System.out.println(!x);//false
		
		boolean b1=10>20;//false
		boolean b2=20>10;//true
		
		System.out.println(b1&&b2);//false
		System.out.println(b1||b2);//true
		
		
		
		

	}

}

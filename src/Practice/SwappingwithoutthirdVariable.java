package Practice;

public class SwappingwithoutthirdVariable {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("value of a before swapping is: " +a+ " Value of b before swapping is: "+b);
		a=a+b;//a=30
		b=a-b;//b=30-20=10
		a=a-b;//20-10=20
		
		System.out.println("After swapping the value of a is: "+a);
		System.out.println("After swapping the value of b is: "+b);

	}

}

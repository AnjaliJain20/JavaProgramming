package Day3Operators;

public class IncrementOperator {

	public static void main(String[] args) {
		// ++ is called increment operator
		
		int a=10;
		
		//Scenario 1 - There is no difference between a++,++a
	    //a++;	//a=a+1;--> post-increment
	    //++a;    //      --> Pre-increment
		//System.out.println(a);
		
		//Scenario 2
		
		//int result= a++;
		int result =++a;
		
		System.out.println(result);//10 11
		System.out.println(a);//

	}

}

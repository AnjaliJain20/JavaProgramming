package Day3Operators;

public class DecrementOperator {
    public static void main(String[]args) {
    	//-- Decrement Operator
    	 int a=100;
    	 //Scenario 1
    	 
    	// a--;
    	//--a; 
    	// System.out.println(a);// 99 99
    	 
    	 //Scenario 2
    	 
    	 //int result =a--;
    	 int result=--a;
    	 
    	 System.out.println(result);//100  99
    	 System.out.println(a);//99        99
    	 
    	 
    }
}

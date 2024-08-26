package Day12ImportantKeywords;


 class test
 {
	 final int x=100;//constant value - non modifiable
}

public class FinalKeyworddemo {

	public static void main(String[] args) {
		
		test t=new test();
	    System.out.println(t.x);
	 //t.x=200;// incorrect, x is final, x can't be assigned,
		

	}

}

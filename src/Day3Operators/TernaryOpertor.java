package Day3Operators;

public class TernaryOpertor {
	
	public static void main(String[]args) {
		int a=10,b=20;
		int result1=a>b?a:b;
		System.out.println("Result of a and b is: "+result1);
		
		int result2=b>a?b:a;
		System.out.println("Result of a and b is:"+result2);
		
		int result3=(1==1)?100:200;
		System.out.println(result3);
		
		int age =80;
		String result4= (age>=18)?"Eligible for vote":"Not Eligible for vote";
		System.out.println(result4);
	}

}

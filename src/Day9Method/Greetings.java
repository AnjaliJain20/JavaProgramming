package Day9Method;

public class Greetings {
	
	
	//1) No Params No value
	
	void greeting1()
	{
		System.out.println("Hello");
	}
	
	//2) No params Return value
	
	String greeting2()
	{
		return "Hello people learn java and selenium";
	}
	
	//3) Take Params No return
	
	     void greeting3(int a , int b)
	     {
	    	 System.out.println("sum of a and b is:"+ (a+b));
	     }
	     
	//4) take params return value
	     
	     int greetings4(int a,int b)
	     {
	    	 return (a+b);
	     }
	     
	
	
	public static void main(String[] args)
	{
		Greetings g=new Greetings();
		//g.greeting1();//1
		
		
		//String str=g.greeting2();//2
		//System.out.println(str);
		//System.out.println(g.greeting2());
		
		//g.greeting3(3,6);// 3
		
		int c=g.greetings4(70, 90);//4
		System.out.println(c);
		
		
	}

}

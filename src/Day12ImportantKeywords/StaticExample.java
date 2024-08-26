package Day12ImportantKeywords;

public class StaticExample {
	 	static int a=10;
	 	int b=20;
	 	static void m1() {
	 		System.out.println("This is static method");
	 	}
	 	void m2() {
	 		System.out.println("This is non-static menthod");
	 	}
	 	
	 	void m3() {
	 		System.out.println(a);
	 		System.out.println(b);
	 		m1();
	 		m2();
	 	}
	public static void main(String[] args) {
		//1) Static method can access static stuff directly(without object creation)
		System.out.println("The value of a is:"+a);
		//System.out.println(b);// incorrect because b is non static variable
		m1();
	   //m2();// incorrect because m2() is static method
		
		//2) Static method can access non-static stuff through object
		StaticExample sx=new StaticExample();
		System.out.println("The value of b is:"+sx.b);
		sx.m2();
		
		//3)
		
		sx.m3();
	}

}

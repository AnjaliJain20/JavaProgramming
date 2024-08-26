package Day15Overriding;
class abc{
	void m1(int a)
	{
		System.out.println(a);
	}
	void m2(int b)
	{
		System.out.println(b);
	}
}

class xyz extends abc{// in xyz total 3 methods present m1 is modified count 1, m2(int b), m2(int a, int b)
	void m1(int a)
	{
		System.out.println(a*a);//overriding
	}
	void m2(int a,int b)// overloaded method
	{
		System.out.println(a+b);
	}	
}
public class OverridingVsOverloading {
   public static void main(String[] args) {
		xyz obj1=new xyz();
		obj1.m1(70);
		obj1.m2(5);
		obj1.m2(10, 20);
	}

}

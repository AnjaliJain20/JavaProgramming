package Day14Inheritance;
class parent{
	void display(int a) {
		System.out.println(a);
	}
}
class Child1 extends parent{
	void show(int b) {
		System.out.println(b);
	}
}
class Child2 extends parent{
	void print(int c) {
		System.out.println(c);
	}
}
class Child3 extends parent{
	void more(int d) {
		System.out.println(d);
	}
}

public class HierarchyInheritance {

	public static void main(String[] args) {
		Child1 c1=new Child1();
		c1.display(100);
		c1.show(200);
	
		Child2 c2=new Child2();
		c2.display(300);
		c2.print(400);
		
		Child3 c3=new Child3();
		c3.display(500);
		c3.more(600);     
	}
}

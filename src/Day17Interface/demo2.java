package Day17Interface;

interface abc{
	int a=10;
	void show();
}
interface xyz{
	int b=20;
	void display();
}

class mno{
	int c=90;
	void print() {
		System.out.println("this is mno method");
		System.out.println(c);
	}
}


//public class demo2 implements abc,xyz extends mno{// this is incorrect 1st need to extend then implement
	public class demo2 extends mno implements abc,xyz{// class should be one and interface can be multiple
	public void show() {
		System.out.println("This is abc menthod");
		System.out.println(a);
	}
	public void display() {
		System.out.println("This is xyz menthod");
		System.out.println(b);	
	}
	
	public static void main(String[] args) {
		demo2 d=new demo2();
		d.show();
		d.display();
		d.print();

	}

}

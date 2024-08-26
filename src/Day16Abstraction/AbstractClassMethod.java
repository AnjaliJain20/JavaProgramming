package Day16Abstraction;
abstract class shape{// abstract class contains abstract ,non abstract and final method
	abstract void draw();// no implementation for abstract method
	void show() {
		System.out.println("Welcome to the jungle");
	}
	final void display() {
		System.out.println("Go with final method");
	}
	
}	
class Circle extends shape{

	void draw() {
		System.out.println("Drawing circle");
	}
	void show() {
		System.out.println("Welcome back");
	}
	
	
}
class Square extends shape{

	void draw() {
		System.out.println("Drawing Square");
	}
	void show() {
		System.out.println("Welcome home");
	}
	/*void display()// final method can not be override
	{
		
	}*/
	


	
}
public class AbstractClassMethod {

	public static void main(String[] args) {
		
	//shape s2=new shape();	// Can't create obj of abstarct class
    shape s=new Circle();
    s.draw();
    shape s1=new Square();
    s1.show();
    s.display();
	}

}

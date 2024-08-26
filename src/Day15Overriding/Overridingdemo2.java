package Day15Overriding;
class animal{
	String color="white";
	void eat() {
		System.out.println("eating...");
	}
}
class dog extends animal{
	String color="Black";
	void displayColor() {
		System.out.println(color);
	}
	void eat() {
		System.out.println("eating bread...");
	}
}

public class Overridingdemo2 {

	public static void main(String[] args) {
		dog g=new dog();
		g.displayColor();
		g.eat();

	}

}

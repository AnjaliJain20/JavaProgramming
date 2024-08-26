package Day12ImportantKeywords;
class animal{
	String color="white";
	void eat() {
		System.out.println("eating...");
	}
}
class dog extends animal{
	String color="Black";
	void displayColor() {
		//Super keyword invokes immediate parent class variables.
		System.out.println(super.color);
	}
	void eat() {
		//System.out.println("eating bread...");
		super.eat();
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		dog g=new dog();
		g.displayColor();
		g.eat();

	}

}

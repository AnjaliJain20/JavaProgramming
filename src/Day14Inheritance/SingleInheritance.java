package Day14Inheritance;
class Animal
{
	String Str="Welcome to jungle";
	void show()
	{
		System.out.println(Str);
	}
}	
class Dog extends Animal
{
	String s;
	
	void walk()
	{
		System.out.println("Walking");
		System.out.println(s);
	}
	
}
	
public class SingleInheritance {

	public static void main(String[] args) {
		
		Dog d=new Dog();
		System.out.println(d.Str);
	    d.s="Dog is barking";		
		d.walk();
		d.show();
	}
}


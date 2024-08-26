package Day17Interface;

interface shape{
	int l=100;//final and static -> because of this only we need to mention the value 
	int w=200;
	void show();
	static void circle(){
		System.out.println("Print circle");
	}
	default void square() {
		System.out.println("Print Square");
	}
}
public class InterfaceDemo implements shape{
	public void show() {
		System.out.println("Hello I am abstract method definition");
	}

	public static void main(String[] args) {
		InterfaceDemo obj =new InterfaceDemo();
		obj.show();
		obj.square();
		//shape s=new shape();// Can't instantiate
		shape s= new InterfaceDemo();
		shape.circle();//static method
		s.square();
		
		
      
	}
}


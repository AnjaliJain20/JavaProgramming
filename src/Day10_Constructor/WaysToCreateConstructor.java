package Day10_Constructor;

public class WaysToCreateConstructor {	
	int x,y;
	String s;	
	WaysToCreateConstructor(){//default constructor
	x=100;
	y=200;
	s="Anjali";
	}	
	void display()
	{
		System.out.println(x+" "+y+" "+s);
	}
	public static void main(String[] args) {
		WaysToCreateConstructor way=new WaysToCreateConstructor();
		way.display();		
  }
}

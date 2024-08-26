package Day10_Constructor;

public class ParameterizedConstructor {
	int x,y;
	String s;	
	ParameterizedConstructor(int a,int b, String str)//parameterized constructor
	{
		x=a;
		y=b;
		s=str;
	}
	void display()
	{
		System.out.println(x+" "+y+" "+s);
	}
	public static void main(String[] args) {
		ParameterizedConstructor pc= new ParameterizedConstructor(100,200,"anjali");
		pc.display();

	}

}

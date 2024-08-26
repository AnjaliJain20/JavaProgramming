package Day14Inheritance;
class Car
{
	int speed=200;
	void print() 
	{
	System.out.println("speed");
	}
	
}
class bike extends Car{
    void display()
    {
    	System.out.println("Riding");
    }
    
}
class texi extends bike{
	void show()
	{
		System.out.println("Travelling");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
      texi t=new texi();
      t.show();
      t.display();
      t.print();
    
      
	}

}

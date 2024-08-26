package Day17Interface;

interface parent1{
	int a=10;
	void show();
}
interface parent2{
	int b=20;
	void display();
}

public class MultipleInheritanceUsingInterface implements parent1,parent2{
	public void show() {
		System.out.println("This is parent1 menthod");
		System.out.println(a);
	}
	public void display() {
		System.out.println("This is parent2 menthod");
		System.out.println(b);	
	}
public static void main(String[]args) {
	MultipleInheritanceUsingInterface m=new MultipleInheritanceUsingInterface();
	m.show();
    m.display();
    
    parent1 p1=new MultipleInheritanceUsingInterface();
    p1.show();
    parent2 p2=new MultipleInheritanceUsingInterface();
    p2.display();
    
  
    
    
	
}
}

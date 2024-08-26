package Day18AccessModifier;

public class MainMethod {

	public static void main(String[] args) {
		AccessModifierDemo p=new AccessModifierDemo();
		//********Private*****
		
		//System.out.println(p.a);//Private variable can be accessed within the class
		//p.show();// Private variable can be accessed within the class
      
		
		//*****Default****
		/*System.out.println(p.b);
		p.display();*/
		
		//*****Protected*****
		//System.out.println(p.c);
		//p.print();
		
	}

}

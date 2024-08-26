package Day18AccessModifier_Part2;

import Day18AccessModifier.AccessModifierDemo;



public class MainMethodPart2 extends AccessModifierDemo{
	
	
	public static void main(String[] args) {
		AccessModifierDemo p=new AccessModifierDemo();
		//********Private*****
		
		//System.out.println(p.a);//Private variable can be accessed within the class
		//p.show();// Private variable can be accessed within the class
      
		
		//*****Default****
		//System.out.println(p.b);// Variable is Invisible outside Package
		//p.display();//Method is Invisible for outside Package
		
		
		//****Protected****
		MainMethodPart2 m2=new MainMethodPart2();
		//System.out.println(m2.c);
		//m2.print();
		
		
		
		
	}
}

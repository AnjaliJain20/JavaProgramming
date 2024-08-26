package Day18AccessModifier_Part2;

import Day18AccessModifier.AccessModifierDemo;

public class MainMethodForPublic {// No need to extend parent class

	public static void main(String[] args) {
		AccessModifierDemo a= new AccessModifierDemo();
		a.define();
	   System.out.println(a.d);
		
	}

}

package Day15Overriding;
class bank
{    
	 void print()
	    {
	    	System.out.println("Welcome to our bank");
	    }
	 double roi() {
		return 12.0;
	}
   	
}
class sbi extends bank{
	double roi() {
		return 18.5;
	}
}
class ICICI extends bank{
	double roi() {
		return 30.9;
	}
}
public class Overridingdemo {

	public static void main(String[] args) {
		sbi s=new sbi();
		System.out.println(s.roi());
		s.print();

		
		ICICI ic=new ICICI();
		System.out.println(ic.roi());
		ic.print();
		
		bank b=new bank();
		System.out.println(b.roi());
		b.print();
		
	}

}

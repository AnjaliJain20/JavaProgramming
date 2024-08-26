package Day11_Overloading;

public class MethodOverloading {
	
	int x,y;
	double d;
	void sum() {
	   x=10;
       y=20;
	   System.out.println(x+y);
	}
	void sum(int a,int b) {
		x=a;
		y=b;
		System.out.println(x+y);
		
	}
	void sum(int m,double n) {
		x=m;
		d=n;
		System.out.println(x+d);
		
	}
	void sum(double n, int m) {
		x=m;
		d=n;
		System.out.println(x+d);
		
	}
	public static void main(String[] args) {
		
      MethodOverloading mo=new MethodOverloading();
      mo.sum();
      mo.sum(208, 20);
      mo.sum(67, 643.9);
      mo.sum(987.98, 345);
    		  
	}

}

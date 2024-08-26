package Day11_Overloading;

public class ConstructorOverloading {
	
	int x,y;
	double d;
	
	ConstructorOverloading(){
		x=10;
		y=20;
	}
	
	ConstructorOverloading(int a, int b){
		x=a;
		y=b;
	}
	ConstructorOverloading(int a,double c){
		x=a;
		d=c;
	}
	ConstructorOverloading(double c,int a){
		x=a;
		d=c;
	}
    void display() {
    	System.out.println("Value of x is :"+x);
    	System.out.println("Value of y is :"+y);
        System.out.println("Value of d is :"+d);
    }
	public static void main(String[] args) {
		ConstructorOverloading co= new ConstructorOverloading(); //1
		//ConstructorOverloading co= new ConstructorOverloading(10,20);//2
		//ConstructorOverloading co= new ConstructorOverloading(10,20.0);//3
		//ConstructorOverloading co= new ConstructorOverloading(20.0,20);
		//ConstructorOverloading co= new ConstructorOverloading(20.5,20.5);// undefined
		co.display();

	}

}

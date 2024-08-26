package Day12ImportantKeywords;

public class ThisKeyword {
	
	int x,y;// x and y - instance variable / class variable
	void setData(int x,int y) // a and b - local variable/method variable
	{
	  //  x=x; //0
	  //  y=y; //0
		
		this.x=x;
		this.y=y;
	}
    void display()
    {
    	System.out.println(x+" "+y);
    }
	public static void main(String[] args) {
		
        ThisKeyword th=new ThisKeyword();
        th.setData(10, 20);
        th.display();
	}

}

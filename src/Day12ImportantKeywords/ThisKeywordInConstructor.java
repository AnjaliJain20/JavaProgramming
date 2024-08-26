package Day12ImportantKeywords;

public class ThisKeywordInConstructor {

	
		int x,y;// x and y - instance variable / class variable
		
		/*ThisKeywordInConstructor(int a,int b){
			//x=a;
			//y=b;
            }*/
		
		ThisKeywordInConstructor(int x,int y){
			this.x=x;
			this.y=y;
		}
		
		
	    void display()
	    {
	    	System.out.println(x+" "+y);
	    }
		public static void main(String[] args) {
			
			ThisKeywordInConstructor th=new ThisKeywordInConstructor(10,20);
	        th.display();
		}

	}


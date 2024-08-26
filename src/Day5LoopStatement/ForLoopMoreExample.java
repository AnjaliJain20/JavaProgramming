package Day5LoopStatement;

public class ForLoopMoreExample {
	public static void main(String[]args) {
		//Example 1-> Print selected value(Conditional statement inside looping statement)
		/*for (int i=1;i<=10;i++) {
			if(i==2||i==7||i==9)
			{
				System.out.println(i);
			}
		}*/
		
		//Example 2-> Print number except 2,7,9
		
		/*for(int i=1;i<=10;i++) {
			if(i==2||i==7||i==9) {
				continue;
			}
			System.out.println(i);
		}*/
		
		//Example 3-> other way of example 2
		/*for (int i=1;i<=10;i++) {
			if(i!=2&& i!=7&&i!=9)
			{
				System.out.println(i);
			}
		}*/
		
		//Example 4-> Looping statement inside conditional statement
		
	    boolean flag=true;
	    if(flag) 
	    {
	    	for(int i=1;i<=10;i++)
	    	{
	    		System.out.println(i);
	    	}

	    }
	    else {
	    	for(int i=10;i>=1;i--)
	    	{
	    		System.out.println(i);
	    	}
	    }
	    
	}

}

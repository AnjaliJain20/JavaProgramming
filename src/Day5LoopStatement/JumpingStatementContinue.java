package Day5LoopStatement;

public class JumpingStatementContinue {

	public static void main(String[] args) {
		//Example 1
		/*for (int i=1;i<=10;i++) {
			if(i<=5) {
				continue;
			}
			System.out.println(i);
		}*/
		
		//Example 2--> Confusing statement
		/*for(int i=1;i<=10;i++) {
			if(i==3&&i==9)
			{
				continue;
			}
			System.out.println(i);//3 and 9 will not come at the same time it will print 1 to 9 number
		}*/
		
		//Example 3--> Confusing statement
		for(int i=1;i<=10;i++) {
			if(i==3||i==9) {
				continue;
			}
			System.out.println(i);// 3 and 9 will not print
		}

	}

}

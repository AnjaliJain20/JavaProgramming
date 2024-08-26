package seleniumPractice;

public class DuplicateStringInStringArray {

	public static void main(String[] args) {
		String str[]= {"abc", "ghj","uyt","abc",};
		
		for (int i=0;i<=str.length-1;i++)
		{
			for(int j=i+1;i<=str.length-1;i++)
				
			{
				if(str[i].equals(str[j])&& (i!=j))
					
				{
					System.out.println(str[j]);
				}
			}
		}
		

	}

}

package Practice_1;

public class UpperAndLower {

	public static void main(String[] args) {
		String s="WeLcOME";
		int upper=0;
		int lower=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch<='A' && ch>='Z')
			{
				upper++;
			}
			else
			{
				lower++;
			}
			
		}

		System.out.println("Upper"+upper);
		System.out.println("Lower"+lower);
	}

}

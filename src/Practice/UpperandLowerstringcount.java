package Practice;

public class UpperandLowerstringcount {

	public static void main(String[] args) {
		String s="WElcome to jAva";
		int lower=0, upper=0;
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch<='A' && ch<='Z')
			{
				upper++;
			}
			else
			{
				lower++;
			}
			
			
		}
		System.out.println("Lower "+lower);
		System.out.println("upper "+upper);

	}

}

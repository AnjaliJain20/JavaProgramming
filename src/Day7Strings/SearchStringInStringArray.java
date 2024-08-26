package Day7Strings;

public class SearchStringInStringArray {
public static void main(String[]args) {
	
	String str[]={"xyz","abc","mno"};
	String search="mno";
	boolean foundstring=false;
	for(int i=0;i<str.length;i++)
	{
		if(str.equals(search))
		{
			foundstring=true;
		}
	}
	
	if(foundstring=true)
	{
		System.out.println("String is present in the string array: "+search);
	}
	else
	{
		System.out.println("String is not present in the string array"+search);
	}
	
	
	
}
}

package Day7Strings;

public class StringOperations {

	public static void main(String[] args) {
		String s="Welcome";
		//System.out.println(s);
		
		//length of a string
		//System.out.println(s.length());//length method - 7
		
		
		//concat() method-- joining string
		
		String s1="Welcome";
		String s2="to java";
		//System.out.println(s1+" "+s2);
		
		//System.out.println(s1.concat(s2));
	
		
		//Concat three string
		
		String s3="Automation";
		
		//System.out.println(s1+s2+s3);
		//System.out.println(s1.concat(s2).concat(s3));
		
		//trim()- Remove left and right spaces in the variable
		//String s4="   Automation  ";
		//System.out.println(s4.trim());
		//System.out.println(s4.length());
		//System.out.println(s4.trim().length());
		
		//charAt()-return a single char based on index we passed
		// index count starts from 0
		
		s="welcome";//0 1 2 3 4 5 6
		System.out.println(s.charAt(6));
		
		//contains- returns boolean value- True/False
		
		//System.out.println(s.contains("com"));
		//System.out.println(s.contains("Com"));
		
		//equals(), equalsIgnoreCase-- Compare 2 string
		
		// Returns boolean value
		
		s1="welcome";
		s2="WELCOME";
		//System.out.println(s1.equals(s2));//false
		//System.out.println(s.equalsIgnoreCase(s2));//true
		
		//Replace()- replace single/multiple characters in string
		
		s="Welcome to selenium with java cucumber framework";
		//System.out.println(s.replace('e', 'v'));
		//System.out.println(s.replace("with", "yes"));
		
		
		
        //substring-To extract substring from main string
		
		/*s="welcome";// start- 0 1 2 3 4 5  end - 1 2 3 4 5 6 7
		System.out.println(s.substring(0, 2));// We
		System.out.println(s.substring(3));// only beginning index */
		
		//split()-Divide the string into multiple parts using delimiter
		//Should not use as a delimiter * & ^ . + - ,_
		
		s="Welcome";
		String str[]=s.split("c");
		//System.out.println(str[0]);//wel
		//System.out.println(str[1]);//ome
		
		// toUpper toLower
		
		s="WELcoMe";
		//System.out.println(s.toUpperCase());
		//System.out.println(s.toLowerCase());
		
		
		
		
	}

}

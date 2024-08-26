package Practice;

public class SplitString {

	public static void main(String[] args) {
		String str1 = "Javaer Maven Jenkins";
        String[] str2 = str1.split(" ");
 
        for (String a : str2)
            System.out.println(a);

	}

}

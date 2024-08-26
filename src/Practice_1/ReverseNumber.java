package Practice_1;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int a= sc.nextInt();
		
		int rev=0,rem=0;
		while(a>0)
		{
			rev=rev*10+a%10;
			a=a/10;
		}
		System.out.println(rev);

	}

}

package Day4ConditionalStatements;

public class AssignmentPrintmonntUsingSwitch {
	public static void main(String[]args) {
		int month_number =12;
		switch(month_number)
		{
		case 1: System.out.println("Jan");break;
		case 2: System.out.println("Feb");break;
		case 3: System.out.println("Mar");break;
		case 4: System.out.println("April");break;
		case 5: System.out.println("May");break;
		case 6: System.out.println("Jun");break;
		case 7: System.out.println("July");break;
		case 8: System.out.println("Aug");break;
		case 9: System.out.println("Sept");break;
		case 10: System.out.println("Oct");break;
		case 11: System.out.println("Nov");break;
		case 12: System.out.println("Dec");break;
		default : System.out.println("Invalid month number");
		}		
	}
}

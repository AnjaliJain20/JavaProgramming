package Day6Array;

public class AssignmentSearchAnElementInArray {

	public static void main(String[] args) {
		int num=30;
		System.out.println("Search " +num +" in an array");
		int a[]= {10,20,30,40,50};
		boolean elementFound = false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==num) {
				elementFound = true;
				break;
			}
		}

		if(elementFound==true)
		{
			System.out.println("The element is found in an array");
		}
	}

}

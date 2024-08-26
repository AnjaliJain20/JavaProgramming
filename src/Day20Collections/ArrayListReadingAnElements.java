package Day20Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListReadingAnElements {

	public static void main(String[] args) {
		ArrayList mylist=new ArrayList();
		mylist.add(10);
		mylist.add(10.5);
		mylist.add(10);
		mylist.add(true);
		mylist.add("anjali");
		mylist.add(null);
		mylist.add(null);
		
		//Reading data 
		
		//way 1: Using for loop 
		/*for (int i=0;i<mylist.size();i++)
		{
			System.out.println("Reading data using For Loop:"+mylist.get(i));
		}*/
		
		//way 2: Using for each loop
		
		/*for (Object x: mylist)
		{
			System.out.println("Reading data using For Each loop: "+x);
		}
		*/
		//Way 3: Using Iterator
		
		/*Iterator It=mylist.iterator();
		while(It.hasNext())// check the next element is present or not
		{
          System.out.println(It.next());			;
		}*/
	}
}

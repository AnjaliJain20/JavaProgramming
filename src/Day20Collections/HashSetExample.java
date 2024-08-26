package Day20Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;


public class HashSetExample {

	public static void main(String[] args) {
		//Declaration
		
		// HashSet hs= new HashSet();
		//  Set hs= new HashSet();
		/* To store only one type of data*/
		//HashSet<Integer> hs= new HashSet<Integer>();
		
		
		//Add data into HashSet
		
		HashSet hs= new HashSet();
		hs.add(10);
		hs.add(10);
		hs.add(10.5);
		hs.add(100);
		hs.add('A');
		hs.add("Anjali");
		hs.add("Anjali");
		hs.add(true);
		hs.add(null);
		hs.add(null);
		
		System.out.println("HashSet Values are: "+hs);
		
		//Size of an HashSet
		System.out.println(hs.size());
		
		// Removing an element
		System.out.println(hs.remove(10));// it takes value from HashSet(Indexing not supported)
		System.out.println(hs.remove(3));// if no found return false(3 not found in HashSet)
		
		//Inserting an element-> Not Possible-> elements are stored in random order
		// Accessing specific element-> not possible directly-> By converting HashSet to ArrayList it is possible
		/* Convert HashSet to ArrayList*/
		ArrayList al=new ArrayList(hs);
		System.out.println(al.get(2));
		
		
		
		
		//Reading all the element from an HashSet
		
		/* For loop -> Not possible-> because there is no index in HashSet*/
		
		/*For each loop*/
		/*for(Object x: hs)
		{
			System.out.println(x);
		}*/
		
		/* Using Iterator*/
		Iterator It=hs.iterator();
		
		while(It.hasNext())
		{
		System.out.println(It.next());
		}
		
		
		

	}

}

package Day20Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		//Declaration
		
		//ArrayList mylist=new ArrayList();
		
		//List mylist=new ArrayList();
		
		//To store one type of data
		//ArrayList<Integer> mylist=new ArrayList<Integer>();
		
		// How to add data into arraylist?
		
		ArrayList mylist=new ArrayList();
		mylist.add(10);
		mylist.add(10.5);
		mylist.add(10);
		mylist.add(true);
		mylist.add("anjali");
		mylist.add(null);
		mylist.add(null);
		
		// printing the arraylist
		System.out.println("The ArrayList elements :"+mylist);
		
		
		// Size of an ArrayList
		
		System.out.println("The Size of an ArrayList is :"+ mylist.size());
		
		
		//Remover element from arraylist
		
		mylist.remove(6);
		System.out.println("After deleteing an element :"+mylist);
		
		//insert an element- insert an element in middle- add method with 2 parameters
		//*add method is used to add an element at the end* with one parameter
		
		mylist.add(2, "mylist");
		
		System.out.println("After insertion the arrayList elements are: "+mylist);
		
		// update/modify/replace an element
		
		mylist.set(2, "your");
		System.out.println("After modifying an element in an array: "+ mylist);
		
		//access specific element from an arraylist
		
		System.out.println("Accessing specific element in an arraylist: "+mylist.get(5));
		
		//checking ArrayList is empty or not
		
		System.out.println("ArrayList is empty or not:"+mylist.isEmpty());
		
		// Remove multiple elements from an ArrayList
		
		ArrayList mylist2=new ArrayList();
		mylist2.add(null);
		mylist2.add(10);
		mylist2.add("anjali");
		mylist.removeAll(mylist2);
		System.out.println("After removing multiple elements from an arraylist:"+mylist);
		
		//Remove all the elements from an arraylist
		
		mylist.clear();
		
		System.out.println("After removing all the elements from an arraylist the list is empty:"+mylist.isEmpty());

	}

}

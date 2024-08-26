package Day20Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;



public class HashMapExample {

	public static void main(String[] args) {
		
		// Declaration 
		
		//HashMap hm=new HashMap();
		//Map hm= new HashMap();		
		//HashMap<Integer,String> hm=new HashMap<Integer,String> ();
		
		
		// Adding pairs to HashMap
		HashMap hm=new HashMap();
		hm.put(101, "Amit");
		hm.put(102, "Anjali");
		hm.put(101, "Ankit");
		hm.put(103, "Anika");
		hm.put(104, "Amita");
		hm.put(105, "Anamika");
		hm.put(106, "Amit");
		
		System.out.println("Putting the value in the HashMap"+hm);//{101=Ankit, 102=Anjali, 103=Anika, 104=Amita, 105=Anamika, 106=Amit}
		
		
		// Size of HashMap
		
		System.out.println("The size of HashMap is :"+hm.size());//6
		
		// Remove pair
		hm.remove(103);
		System.out.println("After Removing pair from HashMap:"+hm);//{101=Ankit, 102=Anjali, 104=Amita, 105=Anamika, 106=Amit}
		
		// Access value of particular key
		
		System.out.println("Accessing value of particular key: "+hm.get(106));//Amit
		
		// Get all the keys
		
		System.out.println(hm.keySet());//[101, 102, 104, 105, 106]
		System.out.println(hm.values());//[Ankit, Anjali, Amita, Anamika, Amit]
		System.out.println(hm.entrySet());//[101=Ankit, 102=Anjali, 104=Amita, 105=Anamika, 106=Amit]
		
		
		// Reading data from HashMap
		
		//Using for each loop
		for(Object k: hm.keySet())
		{
			System.out.println(k+" "+hm.get(k));
		}
		
		
		//using Iterator
		
	    Iterator<Entry<Integer, String>>  It=hm.entrySet().iterator();
		while(It.hasNext())
		{
			Entry<Integer, String>  entry=It.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}

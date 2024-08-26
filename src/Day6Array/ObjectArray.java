package Day6Array;

public class ObjectArray
{

	public static void main(String[] args)
	{
		Object a[]= {10,10.5,'A',"welcome",true};
		//System.out.println(a[2]);
		
		/*for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		
	}*/
	
	     for (Object x:a)
	   {
		System.out.println(x);
	   }
	}
}	
	
	



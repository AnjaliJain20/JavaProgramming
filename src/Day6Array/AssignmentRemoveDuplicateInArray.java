package Day6Array;

public class AssignmentRemoveDuplicateInArray {

	public static void main(String[] args) {
		int temp,flag = 0;
		int a[]= {10,20,20,60,50,50};
		int RemoveDuplicate;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]) 
				{
					flag=a[i];
					flag++;					
				}						
			}						
		}
		if(flag!=0){
			System.out.println("Duplicate element count is "+flag);			
		}
	}
}

package Practice;

public class SortingAnArray 
{

	public void main(String[] args) {
		int a[]= {90,80,76,23,10};
		int temp=0;
		
		for (int i=0; i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
		System.out.println();

	}
}


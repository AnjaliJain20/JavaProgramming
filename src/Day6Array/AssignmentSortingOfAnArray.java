package Day6Array;

public class AssignmentSortingOfAnArray {

	public static void main(String[] args) {
		int a[]= {90,30,100,650,5};
		int temp=0;
		for(int i=0;i<a.length;i++)          //0<4       1<4
		{			
			{
				for(int j=i+1;j<a.length;j++)//j=1 1<4   2 2<4
				{
					if(a[i]>a[j]) {          // if(90>30) if(100>90)
					temp=a[i];               // temp=90   
					a[i]=a[j];               // a[i]=30   
					a[j]=temp;               // a[j]=90   
					}
				}
			}
			System.out.print(a[i]+" ");      // 30 90 100
		}
		System.out.println();
	}
}

package array;

public class Array_basics_l {

	public static void searchInArray(int[] a,int target)
	{
		for(int i:a)
		{
			if(i==target) 
				{
				System.out.println("element present");
				}
		}
		
	}
	
	public static void deleteelementfromanarray(int[] a,int val)
	{
		int i =0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==val) break;
		}
		if(i==a.length) System.out.println("element not found");
		for(int j=i+1;j<a.length;j++)
		{
			a[j-1]=a[j];
		}
		a[a.length-1]=0;
		for(int k:a)
			System.out.println(k);
	}
	
	public static void largestelementinarray(int[] a)
	{
		int max = Integer.MIN_VALUE;
		for(int i:a)
		{
			max = (i>max)?i:max;
		}
		System.out.println(max);
	}
	
	public static void secondlargest(int[] a)
	{
		int max = 0;
		int secondmax = -1;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>a[max]) {
				secondmax = max;
				max = i;
			}
			if(secondmax==-1 || a[i]>a[secondmax])
				secondmax = i;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {2,1,4,6,5};
//		searchInArray(arr, 6);
//		deleteelementfromanarray(arr, 4);
		largestelementinarray(arr);
	}
}

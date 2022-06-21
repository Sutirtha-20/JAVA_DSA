package recursion;

public class L4_recursion_striver {
	
	public static void reversearraywithrecursion(int[] a)
	{
//		  int l = 0;
//		  int r = a.length-1;
//		  reversehelpfunction(a,l,r);
		int i = 0;
		reversehelpfunction2(i,a);
		  for(int k:a)
			  System.out.println(k);
	}
	
	public static void palindromewithrecursion(String s)
	{
		int l = 0;
		int r = s.length()-1;
		System.out.println(palindromewithrecursionhelp(s,l,r));
	}
	
	public static Boolean palindromewithrecursionhelp(String s,int l,int r)
	{
		if(l>=r) return true;
		
		if(s.charAt(l)!=s.charAt(r))
		{
			return false;
		}
		else 
			return palindromewithrecursionhelp(s,l+1,r-1);
	}
	
	//two pointer array reverse
	public static void reversehelpfunction(int[] a,int l,int r)
	{
		if(l>=r) return;
		
		//swap happened
		int temp = a[r];
		a[r]=a[l];
		a[l]=temp;
		
		reversehelpfunction(a,l+1,r-1);
	}
	
	//single pointer array reverse
	public static void reversehelpfunction2(int i,int[] a)
	{
		if(i>a.length/2) return;
		
		//swap happened
		int temp = a[a.length-1-i];
		a[a.length-1-i]=a[i];
		a[i]=temp;
		 
		reversehelpfunction2(i+1,a);
	}
	
	public static void main(String[] args) {
//		int[] arr = {1,3,2,5,4};
//		reversearraywithrecursion(arr);
		String s = "madam ";
		palindromewithrecursion(s);
	}
}

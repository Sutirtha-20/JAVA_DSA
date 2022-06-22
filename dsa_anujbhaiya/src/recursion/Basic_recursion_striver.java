package recursion;

public class Basic_recursion_striver {
	
	//print name n times using recursion
	public static void printname(int i,int n)
	{
		//base case
		if(i>n) return;
		
		System.out.println("Sutirtha");
		printname(i+1, n);
	}
	
	public static void printseries(int i,int n)
	{
		if(i>n) return;
		
		System.out.println(i);
		printseries(i+1, n);
	}
	
	 public static void printinreverse(int n)
	 {
		 if(n<1) return; 
		 
		 System.out.println(n);
		 printinreverse(n-1);
	 }
	 
	 public static void printserieswithbacktrack(int n)
		{
			if(n<1) return;
			
			printserieswithbacktrack(n-1);
			System.out.println(n);
		}
	 
	 public static void printinreversewithbacktrack(int i,int n)
		{
			if(i>n) return;
			
			printinreversewithbacktrack(i+1,n);
			System.out.println(i);
		}
	 
	
	public static void main(String[] args) {
//		printname(1, 5);
//		printinreverse(5);
		printinreversewithbacktrack(1, 5);
	}
}

package recursion;

public class L5_recursion_striver {
	public static int fibonacciwithrecursion(int n)
	{
		//base case
		if(n<=1) return n; 
		
		//if any calculation required
		
		
		//recursion call
		int left = fibonacciwithrecursion(n-1);
		int right = fibonacciwithrecursion(n-2);
		return left+right;
	}
	
	
	public static void main(String[] args) {
		
	}
}

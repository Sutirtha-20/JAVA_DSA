package recursion;

public class Factorial_recursion_striver {
	
	//sum of first 3 numbers using recu rsion
	public static int sum(int n)
	{
		if(n==0) return 0;
		return n+sum(n-1);
	}
	
	public static int fact(int n)
	{
		if(n==1) return 1;
		return n*fact(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(fact(5));
	} 
}

package maths;

public class Maths_l_anujbhaiya {
	public static boolean palindromeNumber(int n)
	{
		int rev = 0;
		int rem = 0;
		int temp = n;
		while(n!=0)
		{
			rem = n%10;
			n = n/10;
			rev = (rev*10)+rem;
		}
		
		return temp==n;
	}
	
	public static int gcd(int a,int b)
	{
		//approach 1
//		int ans = 0;
//		for(int i=Math.min(a, b); i>=1;i--)
//		{
//			if(a%i==0 && b%i==0)
//			{
//				ans = i;
//				break;
//			}
//		}
//		return ans;
		
		//euclidian gcd approach
		if(a==b) return a;
		if(a<b) return gcd(b,a);
		
		return gcd(a-b,b);
		
	}
	
	public static int lcm(int a,int b)
	{
		return (a*b)/gcd(a,b);
	}
	
	public static int nooftrailingzeros(int n)
	{
		int no = 0;
		while(n>0)
		{
			no += n/5;
			n = n/5;
		}
		return no;
	}
	
	public static void main(String[] args) {
		
	}
}

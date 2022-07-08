package bitmanipulation;

public class Basics_anujbhaiya {
	
	public static int findIthbit(int n,int i)
	{
		int mask = 1<<i;
		int res = n & mask;
		if(res==0) return 0;
		else return 1;
	}
	
	public static int toggleIthbit(int n,int k)
	{
		 int mask = 1<<k;
		 int res = n ^ mask;
		 
		 return res;
	}
	
	public static boolean twotothepower(int n)
	{
		int res = n & n-1;
		
		if(res==0) return true;
		else return false;
	}
	
	public static int countsetbits(int n)
	{
		int count = 0;
		while(n!=0)
		{
			int bitval = n & 1;
			if(bitval==1)
				count++;
			n = n>>1;
		 	
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
//		int a = 5;
//		
//		int b = ~a;
//		
//		System.out.println(a+ " "+ b);
		
		System.out.println(findIthbit(5, 3)); //here checking for 5 what is the 3rd index value
	}
}

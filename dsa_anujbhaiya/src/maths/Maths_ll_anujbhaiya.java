package maths;

import java.util.Arrays;

public class Maths_ll_anujbhaiya {
	
	public static boolean checkprime(int n)
	{
		//basic approach
		boolean flag = true;
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0) 
			{
				flag = false;
				break;
			}
		}
		return flag;		
	}
	
	public static void printalldivisors(int n)
	{
//		for(int i=2;i<Math.sqrt(n);i++)
//		{
//			if(n%i==0)
//			{
//				System.out.println(i);
//				System.out.println(n/i);
//			}
//		}
		
//		for(int i=1;i*i<=n;i++)
//		{
//			if(n%i==0)
//			{
//				System.out.println(i);
//				if(n/i!=i)
//					System.out.println(n/i);
//			}
//		}
		
		int i =1;
		for(;i*i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
		i--;
		for(;i>=1;i--)
		{
			if(n%i==0)
				if(n/i != i)
					System.out.println(i);
		}
	}
	
	//tc O(nloglogn)
	public static void sieveoferatosthenes(int n)
	{
		boolean[] arr = new boolean[n+1];
		Arrays.fill(arr, true);
		for(int i=2;i*i<=n;i++)
		{
			if(arr[i])
			{
				for(int j = 2*i;j<=n;j=j+i)
				{
					arr[j]=false;
				}
			}
		}
		for(int i=2;i<=n;i++)
		{
			if(arr[i])
				System.out.println(i);
		}
	}
	
	
	public static int fastpower(int a,int b)
	{
		//base case
		if(b==0) return 1;
		
		int halfpower = fastpower(a, b/2);
		int fullpower = halfpower * halfpower;
		
		if(b%2!=0)
			fullpower = fullpower * a;
		
		return fullpower;
	}
	
	public static void main(String[] args) {
		printalldivisors(25);
	}
}

package array;

import java.util.HashMap;
import java.util.Map;

public class Doubt_session_ll {

	public static int majorityelement(int[] a)
	{
		int currelem = 0;
		int count = 0;
		for(int i =0;i<a.length;i++)
		{
			if(count==0)
			{
				currelem = a[i];
				count=1;
			}
			else {
				if(a[i]==currelem)
					count++;
				else
					count--;
				}
		}
		
		int finalcount = 0;
		for(int i:a)
			if(i==currelem)
				finalcount++;
		
		if(finalcount>a.length/2)
			return currelem;
		else
			return -1;
	}
	
	public static void largestsubarraywithequalzeroandone(int[] a)
	{
		//replacing zeros with -1
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0) a[i]=-1;
		}
		//finding the prefix sum array
		int[] arr = new int[a.length];
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum += a[i];
			arr[i]=sum;
		}
		
//		for(int i:arr)
//			System.out.println(i);
//		int low = 0;
//		int high = arr.length-1;
//		while(low<high)
//		{
//			if(arr[low]==arr[high]) break;	
////			if(arr[low]+arr[high]>0) high--;
////			else low++;
//			else low++;
//		}
//		System.out.println(high);b
//		System.out.println(low);
		
		Map<Integer,Integer> map = new HashMap<>();
		int ans = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
				ans = Math.max(ans, i-map.get(arr[i]));
			else
				map.put(arr[i], i);
		}
		System.out.println(ans);
		
	}
	
	public static void main(String[] args) {
		int[] a= {0,0,0,0,1,0,1,1,0,1};
		largestsubarraywithequalzeroandone(a);
	}
}

package binarysearch;

public class Basics_anujbhaiya {
	
	public static int leftoccurance(int[] a,int key)
	{
		int ans = Integer.MAX_VALUE;
		int l = 0;
		int r = a.length-1;
		while(l<=r)
		{
			int mid = l+(r-l)/2;
			if(a[mid]==key) 
				{
					ans = Math.min(ans, mid);
					r = mid-1;
				}
			else if(key<a[mid]) r = mid-1;
			else l = mid+1;
		}
		
		return ans;
	}
	
	public static int rightoccurance(int[] a,int key)
	{
		int ans = Integer.MIN_VALUE;
		int l = 0;
		int r = a.length-1;
		while(l<=r)
		{
			int mid = l+(r-l)/2;
			if(a[mid]==key) 
				{
					ans = Math.max(ans, mid);
					l = mid+1;
				}
			else if(key<a[mid]) r = mid-1;
			else l = mid+1;
		}
		
		return ans;
	}
	
	public static int totaloccurance(int[] a,int key)
	{
		return rightoccurance(a, key)-leftoccurance(a, key)+1;
	}
	
	public static int leftOccuranceOfOne(int[] a,int k)
	{
		int ans = Integer.MAX_VALUE;
		int l = 0;
		int r = a.length-1;
		while(l<=r)
		{
			int mid = l+(r-l)/2;
			if(a[mid]==k) {
				ans = Math.min(ans, mid);
				r = mid-1;
			}
			else if(k<a[mid]) r = mid-1;
			else l = mid+1;
		}
		return ans;
	}
	
	public static int findUpperBound(int[] a,int k)
	{
		boolean isFound = false;
		int l = 0;
		int r = a.length-1;
		int mid = 0;
		while(l<=r)
		{
			mid = l+(r-l)/2;
			if(a[mid]==k)
			{
				isFound=true;
				break;
			}
			else if(k<a[mid]) r = mid-1;
			else l = mid+1;
		}
		
		return mid;
	}
	
	public static int searchInRotatedArray(int[] a,int key)
	{
		int l = 0;
		int r = a.length-1;
		while(l<=r)
		{
			int mid = l+(r-l)/2;
			if(a[mid]==key) return mid;
			if(a[l]<=a[mid]) {
				if(key>=a[l] && key<a[mid]) r = mid-1;
				else l = mid+1;
			}else {
				if(key>a[mid] && key<=a[r]) l = mid+1;
				else r = mid-1;
			}
		}
		return -1;
	}
	
	public static boolean binarysearch(int[] a,int key)
	{
		int l = 0;
		int r = a.length-1;
		while(l<=r)
		{
			int mid = l+(r-l)/2;
			if(a[mid]==key) return true;
			else if(key<a[mid]) r = mid-1;
			else l = mid+1;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,7,8,9};
		int key = 5;
//		int[] arr = {0,0,0,1,1,1,1,1,1};
//		int key = 1;
//		int[] arr = {1,1,2,4,4,4,4,5,6,6};
//		int key = 4;
		System.out.println(findUpperBound(arr, key));
//		System.out.println(searchInRotatedArray(arr, key));
	}
}

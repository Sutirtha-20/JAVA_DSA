package array;

import java.util.Arrays;

public class Array_basics_iv {
	
	//with O(1) space complexity
	public static int tappingrainwater(int[] arr)
	{
		int leftmax = 0;
		int rightmax = 0;
		int l = 0;
		int r = arr.length-1;
		int ans = 0;
		while(l<r)
		{
			if(arr[l]<arr[r])
			{
				if(arr[l]>leftmax)
					leftmax = arr[l];
				else
					ans += leftmax-arr[l];
				l++;
			}
			else {
				if(arr[r]>rightmax) rightmax=arr[r];
				else ans += rightmax-arr[r];
				r--;
			}
		}
		return ans;
	}
	
	public static int maximumvalueofJMinusI(int[] arr)
	{
		int n = arr.length;
		int[] rightmax = new int[arr.length];
		int[] leftmin = new int[arr.length];
		rightmax[arr.length-1] = arr[arr.length-1];
		leftmin[0] = arr[0];
		for(int i= arr.length-2;i>=0;i--)
		{
			rightmax[i]=Math.max(arr[i], rightmax[i+1]);
		}
		for(int i=1;i<arr.length;i++)
			leftmin[i]=Math.min(arr[i], leftmin[i-1]);
		
		int i = 0,j=0;
		int ans = 0;
		while(i<n && j<n)
		{
			if(leftmin[i]<rightmax[j]) {
				ans += Math.max(ans, j-i);
				j++;
			}
			else
				i++;
		}
		return ans;
	}
	
	//sorted array only 
	public static boolean suminsortedarray(int[] arr,int val)
	{
		int left = 0;
		int right = arr.length-1;
		boolean flag = false;
		while(left<right)
		{
			int sum = arr[left]+arr[right];
			if(sum==val) {
				flag = true;
				break;
			}
			if(sum>val)
				right--;
			else left++;
		}
		return flag;
	}
	
	public static boolean suminsortedarraymodified(int[] arr,int val,int n)
	{
		int left = 0;
		int right = arr.length-1;
		boolean flag = false;
		while(left<right)
		{
			if(left==n) left++;
			if(right==n) right--;
			int sum = arr[left]+arr[right];
			if(sum==val) {
				flag = true;
				break;
			}
			if(sum>val)
				right--;
			else left++;
		}
		return flag;
	}
	
	public static boolean threesumunsortedarray(int a[],int sum)
	{
		Arrays.sort(a);
		boolean flag = false;
		for(int i = 0;i<a.length;i++)
		{
			int bal = sum - a[i];
			flag = suminsortedarraymodified(a,bal,i);
			if(flag) break;
			
		}
		return flag;
	}
	
	
	public static void main(String[] args) {
//		int[] arr = {3,4,5,1,7,2,6,5,4,1};
		int[] arr = {1,2,4,7,3,5,-2,1};
//		int res = tappingrainwater(arr);
		System.out.println(threesumunsortedarray(arr, 9));
//		System.out.println(res);
	}
}

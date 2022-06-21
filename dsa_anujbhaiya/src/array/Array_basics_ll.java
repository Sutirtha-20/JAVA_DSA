package array;

public class Array_basics_ll {
	
	public static int[] leaderelement(int[] arr)
	{
		//leader element are those elements who doesn't have any higher value in its right side
		// time complexity O(n) 
		int max = Integer.MIN_VALUE;
		int[] narr = new int[arr.length];
		int j = 0;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]>max) {
				max = arr[i];
				narr[j++]=arr[i];
			}		
		}
		return narr;
	}
	
	//kadanes algorithm 
	//with O(n) complexity
	public static int maximumsumsubarray(int[] arr)
	{
		int sum = 0;
		int maxsum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum += arr[i];
			if(sum>maxsum)
				maxsum = sum;
			if(sum<0)
				sum = 0;
		}
		return maxsum;
	}
	
	//two pointer approach 
	//with O(1) complexity
	public static int containerwithmostwater(int[] arr)
	{
		int l = 0;
		int r = arr.length-1;
		int maxarea = 0;
		while(l<r)
		{
			int height = Math.min(arr[l], arr[r]);
			int width = (r-l);
			int area = height*width;
			maxarea = Math.max(maxarea, area);
			if(arr[l]<arr[r])
				l++;
			else
				r--;
		}
		return maxarea;
	}
	
	//with O(n) complexity
	public static int tappingrainwater(int[] arr)
	{
		int[] left = new int[arr.length];
		int[] right = new int[arr.length];
		int maxwater = 0;
		
		//calculate the bound at each index that bound will be stored in previous arrays
		left[0] = arr[0];
		right[arr.length-1] = arr[arr.length-1];
		for(int i = 1;i<arr.length;i++)
		{
			left[i]=Math.max(arr[i], left[i-1]);
		}
		for(int i = arr.length-2;i>=0;i--)
		{
			right[i]=Math.max(arr[i], right[i+1]);
		}
		for(int i=0;i<arr.length;i++)
		{
			int val = Math.min(left[i], right[i])-arr[i];
			maxwater += val;
		}
		return maxwater;
	}

	
	public static void main(String[] args) {
		int[] arr = {2,7,6,4,1,3};
		int[] res = leaderelement(arr);
		for(int i:res)
			System.out.println(i);
	}
}

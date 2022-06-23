package recursion;

import java.util.ArrayList;
import java.util.List;

public class L8_recursion_striver {

	public static List<List<Integer>> combinationsum(int[] a,int target)
	{
		List<List<Integer>> ans = new ArrayList<>(); //this is the list of all possible combinations
		List<Integer> list = new ArrayList<>();// this is temp list where will be addidng the value which
		//will result the target val after summation
		combinationsumhelper(0,a,ans,list,target);
		return ans;
	}
	
	public static void combinationsumhelper(int index,int[] a,List<List<Integer>> ans,List<Integer> list,int target)
	{
		int n = a.length;
		
		//base case
		if(index==n)
		{
			if(target==0)
			{
				ans.add(new ArrayList<>(list));
			}
			return;
		}
		
		//picking condition
		if(a[index]<target)
		{
			target = target - a[index];
			list.add(a[index]);
			combinationsumhelper(index,a,ans,list,target);
			list.remove(list.size()-1);
		}
		
		//non picking condition
		combinationsumhelper(index+1,a,ans,list,target);
		
		
	}
	
	public static void main(String[] args) {
		int[] arr = {2,3,6,7};
		int val = 7;
		List<List<Integer>> answer = combinationsum(arr,val);
		for(List<Integer> i : answer)
		{
			for(int k : i)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}

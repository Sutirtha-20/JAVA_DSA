package recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L9_recursion_striver {
	
	public static void combinationsum2(int[] a,int target)
	{
		Set<List<Integer>> ans = new HashSet<>();  
		List<Integer> list = new ArrayList<>();
		combinationsum2helper(0,a,target,ans,list);
		System.out.println(ans);
	}
	
	public static void combinationsum2helper(int index,int[] a,int target,Set<List<Integer>> ans,List<Integer> list)
	{
		int n = a.length;
		if(index==n)
		{
			if(target==0)
				ans.add(new ArrayList<>(list));
			return;
		}
		
		//picking condition
		if(a[index]<target)
		{
			target = target - a[index];
			list.add(a[index]);
			combinationsum2helper(index+1,a,target,ans,list);
			list.remove(list.size()-1);
		}
		
		//non picking condition
		combinationsum2helper(index+1,a,target,ans,list);
	}
	
	
	public static void main(String[] args) {
		int[] arr = {10,1,2,7,6,1,5};
		int val = 8;
//		Set<List<Integer>> something = combinationsum2(arr,val);
//		List<List<Integer>> answer = new ArrayList<>();
//		answer.addAll(something);
//		for(List<Integer> i : answer)
//		{
//			for(int k : i)
//			{
//				System.out.print(k+" ");
//			}
//			System.out.println();
//		}
		combinationsum2(arr,val);
	}
}

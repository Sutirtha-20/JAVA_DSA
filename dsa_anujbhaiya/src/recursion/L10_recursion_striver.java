package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L10_recursion_striver {
	
	public static List<Integer> subsetsum(int[] a)
	{
		List<Integer> list = new ArrayList<>();
		subsetsumhelper(a,0,0,list);
		Collections.sort(list);
		return list;
	}
	
	public static void subsetsumhelper(int[] a,int index,int sum,List<Integer> list) 
	{
		if(index==a.length)
		{
			list.add(sum);
			return;
		}
		//pick
		subsetsumhelper(a, index+1, sum+a[index], list);
		
		//not pick
		subsetsumhelper(a, index+1, sum, list);
	}
	
	public static void main(String[] args) {
		int[] arr = {3,1,2};
//		int n = 3;
		List<Integer> ans = subsetsum(arr);
		for(int i:ans)
			System.out.println(i);
}
}

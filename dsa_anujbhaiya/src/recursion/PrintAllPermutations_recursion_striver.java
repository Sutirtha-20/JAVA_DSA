package recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPermutations_recursion_striver {

	public static List<List<Integer>> permutations(int[] a,int n)
	{
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		boolean[] arr = new boolean[a.length];
		permutationshelper(a,ans,list,arr);
		return ans;
	}
	
	public static void permutationshelper(int[] a, List<List<Integer>> ans, List<Integer> list, boolean[] arr) {
		//base case
		if(list.size()==a.length)
		{
//			System.out.println("hitting base case");
			ans.add(new ArrayList<>(list));
			return;
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(!arr[i])
			{
				arr[i]=true;
				list.add(a[i]);
//				System.out.println(list.size());
				permutationshelper(a, ans, list, arr);
				list.remove(list.size()-1);
				arr[i]=false;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		List<List<Integer>> permutations = permutations(arr, 3);
		for(List<Integer> i:permutations)
		{
			for(int k:i)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
//		System.out.println(permutations.size());
	}
}

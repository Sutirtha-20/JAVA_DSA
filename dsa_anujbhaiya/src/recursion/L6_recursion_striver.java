package recursion;

import java.util.ArrayList;
import java.util.List;

public class L6_recursion_striver {

	public static void printallsubsequence(int[] a)
	{
		List<Integer> list = new ArrayList<>();
		int i = 0;
		printallsubsequencehelper(i,list,a);
		
		
	}
	public static void printallsubsequencehelper(int index,List<Integer> arr,int[] a)
	{
		int n = a.length;
		if(index==n)
		{
			for(int k:arr)
				System.out.print(k+" ");
			System.out.println();
			return;
		}
		arr.add(a[index]);
		printallsubsequencehelper(index+1,arr,a);
		arr.remove(a[index]);
		printallsubsequencehelper(index+1,arr,a);
		
	}
	
	public static void main(String[] args) {
//		int[] arr = new int[]
//		int[] ans = {3,1,2};
//		printallsubsequence(ans);
		System.out.println(2/10);
	}
}

package recursion;

import java.util.*;
class Solution {

    private void findCombinations(int ind, int[] arr, int target, List < List < Integer >> ans, List < Integer > ds) {
        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList < > (ds));
            }
            return;
        }
        
//        System.out.println("target value when went to recursion call:"+target);

        if (arr[ind] <= target) {
            ds.add(arr[ind]);
//            target = ;
//            System.out.println("target value just before going to recursion call"+target);
            findCombinations(ind, arr, target - arr[ind], ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombinations(ind + 1, arr, target, ans, ds);
    }
    public List < List < Integer >> combinationSum(int[] candidates, int target) {
        List < List < Integer >> ans = new ArrayList < > ();
        findCombinations(0, candidates, target, ans, new ArrayList < > ());
        return ans;
    }
}
public class CombinationSum1_recursion_striver {
    public static void main(String[] args) {
        int arr[] = {8 ,1, 8, 6, 8};
        int target = 12;
        Solution sol = new Solution();
        List < List < Integer >> ls = sol.combinationSum(arr, target);
        System.out.println("Combinations are: ");
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.get(i).size(); j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
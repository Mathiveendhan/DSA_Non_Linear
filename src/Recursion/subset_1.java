package Recursion;
import java.util.*;

public class subset_1 {
    public static void call(int idx, List<Integer> list, int n, int[] arr, List<List<Integer>> ans) {
        if (idx >= n) {
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[idx]);
        call(idx + 1, list, n, arr, ans);
        list.remove(list.size() - 1);
        call(idx + 1, list, n, arr, ans);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        call(0, list, nums.length, nums, ans);
        return ans;
    }
    public static void main(String[] args){
        int[] nums={1,2,3};
        System.out.println(subsets(nums));
            }
    }


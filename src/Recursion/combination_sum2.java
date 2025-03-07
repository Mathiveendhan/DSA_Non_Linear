package Recursion;
import java.util.*;

public class combination_sum2 {
    public static void f(int i, int[] arr, List<List<Integer>> ans, int target, ArrayList<Integer> ds) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int j = i; j < arr.length; j++) {
            if (j > i && arr[j] == arr[j - 1]) {
                continue;
            }
            if(arr[i]>target) break;

            if (arr[j] <= target) {
                ds.add(arr[j]);
                f(j + 1, arr, ans, target - arr[j], ds);
                ds.remove(ds.size() - 1);
            }
        }
    }

    public static List<List<Integer>> call(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        f(0, candidates, ans, target, new ArrayList<>());
        return ans;
    }
        public static void main(String[] args){
            int[] candidates={10,1,2,7,6,1,5};
            int target=8;
            System.out.println(call(candidates,target));

        }
    }


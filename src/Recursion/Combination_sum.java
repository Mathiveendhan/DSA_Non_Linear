package Recursion;
import java.util.*;

class Combination_sum{
    public static void f(int i,int[] arr,List<List<Integer>> ans,int target,ArrayList<Integer> ds){
        if(i==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[i]<=target){
            ds.add(arr[i]);
            f(i,arr,ans,target-arr[i],ds);
            ds.remove(ds.size()-1);
        }
        f(i+1,arr,ans,target,ds);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        f(0,candidates,ans,target,new ArrayList<>());
        return ans;
    }

    public static void main(String[] args){
        int[] candidates={2,3,6,7};
        int target=7;
        System.out.println(combinationSum(candidates,target));
    }
}
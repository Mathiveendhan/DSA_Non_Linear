package Recursion;
import java.util.*;

public class subset_sum {
    public static void call(int i,int sum,int[] nums,int n,ArrayList<Integer> ans){
        if(i==n){
            ans.add(sum);
            return;
        }
        call(i+1,(sum+nums[i]),nums,n,ans);
        call(i+1,sum,nums,n,ans);
    }
    public static ArrayList<Integer> subset_sum(int[] nums){
        ArrayList<Integer> ans=new ArrayList<>();
        call(0,0,nums,nums.length,ans);
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args){
        int[] nums={3,1,2};
        System.out.println(subset_sum(nums));
    }
}

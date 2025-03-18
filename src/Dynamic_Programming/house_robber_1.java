package Dynamic_Programming;
import java.util.*;

public class house_robber_1 {
    public static int call(int[] nums, int i,int[] dp) {
        if (i < 0) {
            return 0;
        }
        if(i<nums.length && dp[i]!=-1){
            return dp[i];
        }

        int fs = call(nums, i - 2,dp) + nums[i];
        int ss = 0 + call(nums, i - 1,dp);
        return dp[i]=Math.max(fs,ss);
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        System.out.println(call(nums,nums.length-1,dp));;
    }
}

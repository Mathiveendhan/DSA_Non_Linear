package Dynamic_Programming;

import java.util.*;

public class fibonacci {


    //    recursion method
//    public static int f(int n){
//        if(n<=1){
//            return n;
//        }
//        return f(n-1)+f(n-2);
//    }



    //memoization method(top-down approach)
//    static Map<Integer,Integer> map=new HashMap<>();
//    public static int f(int n){
//        if(n<=1){
//            return n;
//        }
//        if(map.containsKey(n)){
//            return map.get(n);
//        }
//        int result=f(n-1)+f(n-2);
//        map.put(n,result);
//        return result;
//    }


    // Tabulation method
    public static int f(int n){
        if (n <= 1) return n;
        int prev2 = 0, prev = 1;
        for (int i = 2; i <= n; i++) {
            int cur = prev + prev2;
            prev2 = prev;
            prev = cur;
        }
        return prev;


//        if(n<=1){
//            return n;
//        }
//        int[] dp=new int[n+1];
//        dp[0]=0;
//        dp[1]=1;
//        for(int i=2;i<=n;i++){
//            dp[i]=dp[i-1]+dp[i-2];
//        }
//        return dp[n];


    }


    public static void main(String[] args){
        System.out.println(f(5));
    }
}

package Recursion;
import java.util.*;
public class subsequence_count {

    public static int f(int i,int[] arr,int sum,int s,int n){
        if(i==n){
            if(sum==s){
               // System.out.println(list);
                return 1;
            }
            return 0;
        }
        s+=arr[i];
       int l= f(i+1,arr,sum,s,n);
        s-=arr[i];
       int r= f(i+1,arr,sum,s,n);
       return l+r;
    }
    public static void main(String[] args){
        int[] arr={1,2,1};
        int sum=2;
        System.out.println(f(0,arr,sum,0,arr.length));

    }
}

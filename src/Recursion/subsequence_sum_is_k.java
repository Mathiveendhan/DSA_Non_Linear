package Recursion;
import java.util.*;
public class subsequence_sum_is_k {

    public static void f(int i,int[] arr,ArrayList<Integer> list,int sum,int s,int n){
        if(i==n){
            if(sum==s){
                System.out.println(list);
            }
            return;
        }
        list.add(arr[i]);
        s+=arr[i];
        f(i+1,arr,list,sum,s,n);
        list.remove(list.size()-1);
        s-=arr[i];
        f(i+1,arr,list,sum,s,n);
    }
    public static void main(String[] args){
        int[] arr={1,2,1};
        int sum=2;
        ArrayList<Integer> list=new ArrayList<>();

        f(0,arr,list,sum,0,arr.length);
    }
}

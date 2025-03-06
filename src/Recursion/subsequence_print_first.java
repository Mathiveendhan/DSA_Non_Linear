package Recursion;
import java.util.*;

public class subsequence_print_first {

    public static boolean f(int i,int[] arr,ArrayList<Integer> list,int sum,int s,int n){
        if(i==n){
            if(sum==s){
                System.out.println(list);
                return true;
            }
            return false;
        }
        list.add(arr[i]);
        s+=arr[i];
        if(f(i+1,arr,list,sum,s,n)==true){
            return true;
        }
        list.remove(list.size()-1);
        s-=arr[i];
        if( f(i + 1, arr, list, sum, s, n)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr={1,2,1};
        int sum=2;
        ArrayList<Integer> list=new ArrayList<>();

        f(0,arr,list,sum,0,arr.length);
    }
}

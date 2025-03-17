package Recursion;
import java.util.*;

public class police_robber_4 {
        public static void call(int[] nums, ArrayList<Integer> arr, int k, int i, ArrayList<Integer> maxi) {
            if (k == 0) {
                maxi.add(Collections.max(arr));
            }
            if (i >= nums.length) {
                return;
            }
            arr.add(nums[i]);
            call(nums, arr, k - 1, i + 2, maxi);
            arr.remove(arr.size() - 1);
            call(nums, arr, k, i + 1, maxi);
        }

        public static int minCapability(int[] nums, int k) {
            ArrayList<Integer> maxi = new ArrayList<>();
            ArrayList<Integer> arr = new ArrayList<>();
            call(nums, arr, k, 0, maxi);
            return Collections.min(maxi);
        }
// class Solution {
//     public static void call(int[] nums,ArrayList<ArrayList<Integer>> fsol,ArrayList<Integer> arr,int k,int i){
//         if(k==0){
//             fsol.add(new ArrayList<>(arr));
//             return;
//         }
//         if(i>=nums.length){
//             return;
//         }
//         arr.add(nums[i]);
//         call(nums,fsol,arr,k-1,i+2);
//         arr.remove(arr.size()-1);
//         call(nums,fsol,arr,k,i+1);
//     }
//     public int minCapability(int[] nums, int k) {
//         ArrayList<ArrayList<Integer>> fsol=new ArrayList<>();
//         ArrayList<Integer> arr=new ArrayList<>();
//         call(nums,fsol,arr,k,0);
//         ArrayList<Integer> maxi=new ArrayList<>();
//         for(ArrayList<Integer> i:fsol){
//             maxi.add(Collections.max(i));
//         }

//         return Collections.min(maxi);

//     }
// }
     public static void main(String[] args) {
            int[] nums={2,3,5,9};
            int k=2;
         System.out.println(minCapability(nums,k));

   }
}

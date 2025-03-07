package Recursion;

import java.util.*;
public class subsequences {
    public static void print(int idx, int[] arr, ArrayList<Integer> list, int n) {
        if (idx >= n) {
            System.out.println(list);
            return;
        }
        // print(idx + 1, arr, list, n);
        list.add(arr[idx]);
        print(idx + 1, arr, list, n);
        list.remove(list.size() - 1);
        print(idx + 1, arr, list, n);

    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        int n = arr.length;
        ArrayList<Integer> list =  new ArrayList<>();
        print(0, arr, list, n);
    }
}

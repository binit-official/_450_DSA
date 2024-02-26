package Array;

import java.util.ArrayList;

//Given an array 'arr' with 'n' elements, the task is to rotate the array to the left by 'k' steps, where 'k' is non-negative.

public class q59 {

    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int s=arr.size();
        for (int i = 1; i <= k; i++) {
            int temp=arr.get(0);

            for (int j = 0; j < arr.size()-1; j++) {
                arr.set(j, arr.get(j+1));
            }
            arr.set(s-1, temp);

        }
        return arr;

}}

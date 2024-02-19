package Conceptual_questions;

// Mergesort

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class q13 {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length of the array");
    int l=sc.nextInt();
    int arr[]=new int[l];
    System.out.println("Enter the elements");
    for (int i = 0; i <arr.length ; i++) {
        arr[i]=sc.nextInt();
    }
    mergeSort(arr,0,l-1);
    System.out.println(Arrays.toString(arr));
}
   static void mergeSort(int arr[], int l, int r){
        if(l>=r){
            return;
        }
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);

   }
    private static void merge(int[] arr, int l, int mid, int r) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = l;
        int right = mid + 1;

        while (left <= mid && right <= r) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }


        while (right <= r) {
            temp.add(arr[right]);
            right++;
        }
        for (int i = l; i <= r; i++) {
            arr[i] = temp.get(i - l);
        }
   }
}

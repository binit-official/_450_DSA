package Array;

import java.util.Arrays;
import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length of the array");
    int l= sc.nextInt();
    int [] arr=new int[l];
    System.out.println("Enter the elements");
    for(int i = 0; i < l; i++) {
        arr[i]=sc.nextInt();
    }
     insertionsort(arr);
}

    private static void insertionsort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
}

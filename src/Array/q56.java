package Array;

//Find the largest element in array

import java.util.Scanner;

public class q56 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int a=largestElement(arr,n);
        System.out.println(a);
    }
    static int largestElement(int[] arr, int n) {
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)max=arr[i];
        }
        return max;

    }
}

package Array;

//rotate the array to the left by 1

import java.util.Arrays;
import java.util.Scanner;

public class q52 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element in array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int res[]=rotateArray(arr,n);
        System.out.println(Arrays.toString(res));

    }
    static int[] rotateArray(int[] arr, int n) {
        int temp=0;

        temp=arr[0];
        for(int j=0;j<n-1;j++){
            arr[j]=arr[j+1];

        }
        arr[arr.length-1]=temp;

        return arr;

    }
}

package Array;

import java.util.Arrays;
import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int l= sc.nextInt();
        int [] arr=new int[l];
        System.out.println("Enter the elements");
        for (int i = 0; i < l; i++) {
            arr[i]=sc.nextInt();
        }
        bubblesort(arr);
    }

    private static void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=0; j<arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

package Conceptual_questions;

import java.util.Arrays;
import java.util.Scanner;

public class q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to insert");
        int n = sc.nextInt();
        System.out.println("Enter the numbers in the array");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int reverse[]=reverseArray(n,a);
        System.out.println(Arrays.toString(reverse));

    }
    public static int[] reverseArray(int n, int []nums) {
        int i=0;
        int j=n-1;
        int temp=0;
        while(i<n/2){
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
            if(i==j)break;

        }
        return nums;

    }
}

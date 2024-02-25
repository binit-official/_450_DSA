package Array;

//print the number of duplicates removed from the array

import java.util.Scanner;

public class q53 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int a=removeDuplicates(arr,n);
        System.out.println(a);
    }
    public static int removeDuplicates(int[] arr,int n) {
        int c=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                c+=1;
            }
        }
        return c+1;
    }
}

package Array;

//check if the array is sorted or not

import java.util.Scanner;

public class q54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k=isSorted(n,arr);
        System.out.println(k);
    }
    public static int isSorted(int n, int []a) {
        int k=2;
        for(int i=0;i<n-1;i++){
            if(a[i]<=a[i+1])k=1;
            else{
                k=0;
                break;
            }
        }
        return k;
    }
}

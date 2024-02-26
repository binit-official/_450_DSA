package Array;

//move all zeros to the right and maintain the same order of the non zero characters of the array

import java.util.Arrays;
import java.util.Scanner;

public class q57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int []a = moveZeros(n,arr);
        System.out.println(Arrays.toString(a));
    }
    public static int[] moveZeros(int n, int []a) {
        int arr[]=new int[n];
        int j=0;
        int c=0;
        for (int i=0;i<n;i++) {
            if(a[i]!=0){
                arr[j]=a[i];
                j++;
            }
            else c+=1;

        }
        for(int i=n-1;i>=n-c;i--){
            arr[i]=0;
        }

        return arr;
    }
}

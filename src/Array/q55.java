package Array;

//Find the 2nd smallest and 2nd largest element of the array

import java.util.Arrays;
import java.util.Scanner;

public class q55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k[]=getSecondOrderElements(n,arr);
        System.out.println(Arrays.toString(k));
    }
    public static int[] getSecondOrderElements(int n, int []a) {
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        int []arr=new int[2];
        arr[0]=a[1];
        arr[1]=a[n-2];
        return arr;
    }
}

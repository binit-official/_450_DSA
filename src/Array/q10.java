package Array;

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

    }
}

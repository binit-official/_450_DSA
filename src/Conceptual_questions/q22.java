package Conceptual_questions;

//You are given an integer ‘n’.
//
//
//
//Your task is to return an array containing integers from ‘n’ to ‘1’ (in decreasing order) without using loops.

import java.util.Arrays;
import java.util.Scanner;

public class q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res[]=printNos(n);
        System.out.println(Arrays.toString(res));}
    public static int[] printNos(int x) {
        int arr[]=new int[x];
        int j=0;
        recursion(arr,x,j);
        return arr;

    }
    public static void recursion(int arr[], int x, int j){
        if(x==0)return;
        arr[j++]=x;
        recursion(arr, x-1, j);
    }
}

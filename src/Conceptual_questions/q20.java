package Conceptual_questions;

//You are given an integer ‘n’.
//
//
//
//Your task is to return an array containing integers from 1 to ‘n’ (in increasing order) without using loops.

import java.util.Arrays;
import java.util.Scanner;

public class q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res[]=printNos(n);
        System.out.println(Arrays.toString(res));
    }
    public static int[] printNos(int x) {
        int []ans = new int[x];
        recursiveFunction(x, ans);

        return ans;
    }

    public static void recursiveFunction(int x, int []ans) {
        if(x == 0) {
            return;
        }
        ans[x - 1] =x;
        recursiveFunction(x - 1, ans);


    }
}


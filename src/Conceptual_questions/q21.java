package Conceptual_questions;

//You are given an integer ‘n’.
//
//
//
//Print “Coding Ninjas ” ‘n’ times, without using a loop.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String>list=new ArrayList<>(n);
        list=printNtimes(n);
        System.out.println(Arrays.toString(list.toArray()));

    }
    public static List<String> printNtimes(int n){
        List<String >list=new ArrayList<>(n);
        recursion(list,n);
        return list;

    }

    private static void recursion(List<String> list, int n) {
        if(n == 0) {
            return;
        }
        list.add("Coding Ninjas");
        recursion(list,n - 1);
    }
}


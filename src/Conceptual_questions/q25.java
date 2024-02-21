package Conceptual_questions;

import java.util.Scanner;

public class q25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String str) {
        String s="";
        int i=0;
        int n=str.length();
        for (i = 0; i < n; i++) {
            s=str.charAt(i)+s;

        }
        System.out.println(s);
        if(str.equals(s))return true;
        else return false;
}}

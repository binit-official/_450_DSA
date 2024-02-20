package Conceptual_questions;

//check if a number is palindrome or not

import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (palindromeNumber(n)) System.out.println("YES");
        else System.out.println("NO");
    }

    public static boolean palindromeNumber(int n) {
        int s = 0;
        int a = n;
        int d = 0;
        while (n != 0) {
            d = n % 10;
            s = s * 10 + d;
            n = n / 10;
        }
        if (s == a) return true;
        else return false;

    }
}

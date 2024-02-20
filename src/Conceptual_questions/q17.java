package Conceptual_questions;

//find the gcd of two numbers

import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int res = calcGCD(n, m);
        System.out.println("GCD is "+res);
    }

    public static int calcGCD(int n, int m) {
        if (n == 0)
            return m;

        return calcGCD(m % n, n);
    }
}

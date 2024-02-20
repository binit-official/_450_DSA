package Conceptual_questions;

//You are given an integer 'n'.
//
//
//
//Return 'true' if 'n' is an Armstrong number, and 'false' otherwise.
//
//
//
//Note:
//An Armstrong number is a number (with 'k' digits) such that the sum of its digits raised to 'kth' power is equal to the number itself. For example, 371 is an Armstrong number because 3^3 + 7^3 + 1^3 = 371.

import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int a = n;
        int d = 0;
        double s = 0;
        int c = 0;
        while (n != 0) {
            c += 1;
            n = n / 10;
        }
        n = a;

        while (n != 0) {
            d = n % 10;
            s = s + Math.pow(d, c);
            n = n / 10;
        }
        if (s == a) System.out.println(true);
        else System.out.println(false);
    }
}

package Conceptual_questions;

import java.util.Scanner;

public class q23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        long n=sc.nextInt();
        long s=sumFirstN(n);
        System.out.println(s);

    }
    public static long sumFirstN(long n) {
        if(n<=1)
            return n;

        return n+sumFirstN(n-1);

    }

}

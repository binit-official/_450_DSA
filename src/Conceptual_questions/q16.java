package Conceptual_questions;

//Check prime

import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        if(isPrime(n)) System.out.println("YES");
        else System.out.println("NO");
    }
    public static boolean isPrime(int num) {


        if(num==1)
            return false;
        for (int i = 2; i*i <= num; i++) {
            if(num%i==0){
                return false;
            }

        }


        return true;
    }
}

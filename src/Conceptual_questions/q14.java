package Conceptual_questions;

//You are given a number ’n’.
//
//
//
//Find the number of digits of ‘n’ that evenly divide ‘n’.
//
//
//
//Note:
//A digit evenly divides ‘n’ if it leaves no remainder when dividing ‘n’.
//
//
//Example:
//Input: ‘n’ = 336
//
//Output: 3
//
//Explanation:
//336 is divisible by both ‘3’ and ‘6’. Since ‘3’ occurs twice it is counted two times

import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int res=countDigits(n);
        System.out.println("No. of digits are "+res );
    }

    public static int countDigits(int n) {

        int c = 0;
        int d = 0;
        int a = n;
        int b = 0;
        int f = 0;
        int j = 0;
        while (n != 0) {
            n = n / 10;
            b += 1;

        }
        n = a;

        int[] arr = new int[b];
       if (n == 0) {
           return 0;
        }
        int i;
        for (i = 0; i < b; i++) {

            {
                d = n % 10;
                if (d != 0) {
                    if (a % d == 0) {


                            c+=1;


                    }
                }
                n = n / 10;
            }
        }


        return c;
    }
}


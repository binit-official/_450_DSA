package Conceptual_questions;

//Write a program to input an integer 'n' and print the sum of all its even digits and the sum of all its odd digits separately.

import java.util.Scanner;

public class q26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=0;
        int e=0;
        int o=0;
        while(n!=0){
            d=n%10;
            if(d%2==0){
                e+=d;
            }
            else o+=d;
            n/=10;

        }
        System.out.print(e+" "+o);

    }
}

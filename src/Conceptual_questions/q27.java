package Conceptual_questions;

import java.util.Scanner;

//Provided 'n' you have to find out the n-th Fibonacci Number. Handle edges cases like when 'n' = 1 or 'n' = 2 by using conditionals like if else and return what's expected.
//
//"Indexing is start from 1"

public class q27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=1;
        int b=1;
        int c=0;
        int n=sc.nextInt();
        if(n==1||n==2)System.out.println(1);
        else{for(int i=1;i<n-1;i++){
            c=a+b;
            a=b;
            b=c;
        }
            System.out.println(c);}


    }
}

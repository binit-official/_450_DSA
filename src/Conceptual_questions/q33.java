package Conceptual_questions;

import java.util.Scanner;

public class q33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n;


        for(int i=1;i<=a;i++){
            for (int j =1; j<=n-1 ; j++) {
                System.out.print(" ");

            }
            for(int j=1;j<i*2;j++){
                System.out.print("*");
            }
            for (int j =1; j<=n-1 ; j++) {
                System.out.print(" ");

            }
            n--;
            System.out.println();


        }
    }
}

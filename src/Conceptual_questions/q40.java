package Conceptual_questions;

import java.util.Scanner;

public class q40 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n;
        for(int i=1; i<=a;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=n+(n-1);j>=1;j--){
                System.out.print("*");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
            n--;

        }
    }
}

package Conceptual_questions;

import java.util.Scanner;

public class q49 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=65;
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print((char)c+" ");
                c++;
            }
            System.out.println();
            c=65;

        }

    }
}

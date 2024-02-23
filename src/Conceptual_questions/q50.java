package Conceptual_questions;

import java.util.Scanner;

public class q50 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=65;
        int a=n;
        for(int i=1;i<=a;i++){
            for(int j=i;j>=1;j--){
                System.out.print((char)(c+n-1)+" ");
                n--;

            }
            c=65;
            n=a;
            System.out.println();
        }
    }
}

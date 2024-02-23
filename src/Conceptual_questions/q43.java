package Conceptual_questions;

import java.util.Scanner;

public class q43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int j=i;
            while(j>=1){
                System.out.print(j%2+" ");
                j--;
            }
            System.out.println();
        }
    }
}

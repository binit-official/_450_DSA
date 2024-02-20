package Conceptual_questions;

//sum of all divisors from 1 to n

import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int s=sumOfAllDivisors(n);
        System.out.println(s);
    }
    public static int sumOfAllDivisors(int n){

        int s=0;
        if(n==0)return 0;
        for(int i=n;i>0;i--){
            if(n%i==0){
                s=s+i;
            }




        }
        return s+sumOfAllDivisors(n-1);
    }
}

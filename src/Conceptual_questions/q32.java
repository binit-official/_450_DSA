package Conceptual_questions;

//Given an integer ‘n’, return first n Fibonacci numbers using a generator function.
//Example:
//Input: ‘n’ = 5
//Output: 0 1 1 2 3

public class q32 {
    public static int[] generateFibonacciNumbers(int n) {

        int arr[]=new int[n];
        int a=0;
        int b=1;
        arr[0]=0;
        if(n==0||n==1){
            return arr;
        }
        int c=0;
        for(int i=1;i<n;i++){
            a=b;
            b=c;
            c=a+b;
            arr[i]=c;
        }
        return arr;
    }
}

package Bit_Manipulation;

//You are given an integer 'N'.
//
//
//
//Return 'odd' if the given number 'N' is odd, else return 'even'.

public class q66{
    public static String oddEven(int N){
        if((N&1)==1)return "odd";
        else return "even";
    }
}
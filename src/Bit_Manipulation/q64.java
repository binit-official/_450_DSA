package Bit_Manipulation;

//You have a 32-bit unsigned integer called 'num' and another integer called 'i'.
//
//
//
//You need to perform the following operations on the 'num' integer based on the value of 'i':
//
//
//
//1. Get the bit value at the "i"th position of "num".
//
//2. Set the bit at the "i"th position of "num".
//
//3. Clear the bit at the "i"th position of "num".
//
//
//
//We are starting bits from 1 instead of 0. (1-based)

import java.lang.Math;
public class q64 {
    public static int[] bitManipulation(int num, int i){
        int arr[]=new int[3];
        int c=0;
        int k=(1<<(i-1));
        if((num & k)!=0) c=1;
        arr[0]=c;
        if(c==0){
            num=(num|k);
        }
        arr[1]=num;
        num=num-(int)(Math.pow(2, i-1));
        arr[2]=num;

        return arr;

    }
}


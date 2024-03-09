package Array;

//For a given integer array/list 'ARR' of size 'N' containing all distinct values, find the total number of 'Inversions' that may exist.
//
//An inversion is defined for a pair of integers in the array/list when the following two conditions are met.
//
//A pair ('ARR[i]', 'ARR[j]') is said to be an inversion when:
//
//1. 'ARR[i] > 'ARR[j]'
//2. 'i' < 'j'

public class q63 {
    public static long getInversions(long arr[], int n) {

        long c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if((i<j)&(arr[i]>arr[j])){
                    c=c+1;
                }
            }
        }
        return c;


    }
}

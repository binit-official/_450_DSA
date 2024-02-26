package Array;

//You are given a sorted array 'arr' of positive integers of size 'n'.
//
//
//
//It contains each number exactly twice except for one number, which occurs exactly once.
//example
//Input: ‘arr’ = {1, 1, 2, 3, 3, 4, 4}.
//
//Output: 2

public class q58 {

    public static int getSingleElement(int []arr){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(i<=arr.length-3){
                if(arr[i]!=arr[i+1] & arr[i+1]!=arr[i+2]){
                    c=arr[i+1];
                    break;

                }

            }
            else{
                c=arr[arr.length-1];
                break;
            }

        }
        return c;
    }
}

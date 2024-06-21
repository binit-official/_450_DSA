package Bit_Manipulation;

//check if a number is a power of 2 or not


public class q68 {
    class Solution {
        public boolean isPowerOfTwo(int n) {
            if(n==0)return false;
            else return ((n&(n-1))==0);
        }
    }

}

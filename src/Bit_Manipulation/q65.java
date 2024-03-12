package Bit_Manipulation;

//Given a number ‘N’ and a number ‘K’. Return true if ‘K’th bit of number is set, else return false.

public class q65 {
    static boolean isKthBitSet(int n, int k) {
        int i=(1<<k-1);
        if((n&i)!=0)return true;
        else return false;
    }
}

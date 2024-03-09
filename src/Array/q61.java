package Array;

//You are given an integer ’n’.
//
//
//
//Your task is to return a sorted array (in increasing order) containing all the factorial numbers which are less than or equal to ‘n’.


import java.util.ArrayList;
import java.util.List;

public class q61 {
    public static List<Long> factorialNumbers(long n) {
        List<Long>list=new ArrayList<Long>();
        long fact = 1;
        long x = 2;
        while (fact <= n)
        {
            list.add(fact);



            fact = fact * x;

            x++;
        }
        return list;

    }
}

package Array;

//You are given an array 'arr' of length 'n' containing integers within the range '1' to 'x'.
//
//
//
//Your task is to count the frequency of all elements from 1 to n.
//
//Note:
//You do not need to print anything. Return a frequency array as an array in the function such that index 0 represents the frequency of 1, index 1 represents the frequency of 2, and so on.

public class q62 {
    public static int[] countFrequency(int n, int x, int []nums) {
        int a[] = new int[n];

        int c = 0;


        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    c++;
                }
            }
            a[i - 1] = c;
            c = 0;

        }
        return a;

    }
}


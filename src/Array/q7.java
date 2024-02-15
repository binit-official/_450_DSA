package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Given an array 'arr' with 'n' elements, the task is to rotate the array to the left by 'k' steps, where 'k' is non-negative.
public class q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        ArrayList<Integer>a=new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int s=sc.nextInt();
            a.add(s);

        }
        System.out.println("Enter the number of times you want to rotate");
        int k=sc.nextInt();

        System.out.println((rotateArray(a,k)));
    }

    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int s=arr.size();
        for (int i = 1; i <= k; i++) {
            int temp=arr.get(0);

            for (int j = 0; j < arr.size()-1; j++) {
                arr.set(j, arr.get(j+1));
            }
            arr.set(s-1, temp);

        }
        return arr;
    }
}
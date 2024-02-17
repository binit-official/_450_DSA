package Array;
//Find the unique number in an array
import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int l=sc.nextInt();
        int arr[]=new int[l];
        System.out.println("Enter the elements of array");
        for (int i = 0; i <l ; i++) {
            arr[i]=sc.nextInt();
        }
        int res=findUnique(arr);
        if (res!=-10000){
        System.out.println("The unique number is "+ res);}
    }
    public static int findUnique(int[] arr) {
        int c = 0;
        int res;
        int i;
        for (i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    c += 1;
                }

            }
            if (c == 1) {
                return arr[i];

            }
            c=0;
        }
     return -10000;
    }
}

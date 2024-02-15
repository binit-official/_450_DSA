package Array;
import java.util.Arrays;
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
           a[i]=sc.nextInt();
        }
        int result[]=separateNegativeAndPositive(a);
        System.out.println(Arrays.toString(result));

    }
        public static int[] separateNegativeAndPositive(int a[]) {
            int i=0;
            int temp;
            for (int j = 0; j < a.length; j++) {
                if (a[j]<0){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    i++;
                }
            }
            return a;

        }
    }


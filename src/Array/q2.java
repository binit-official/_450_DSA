package Array;
//Find the maximum and minimum element in an array
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to insert");
        int n=sc.nextInt();
        System.out.println("Enter the numbers in the array");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=0;
        int min=a[1];
        for (int i = 0; i <n ; i++) {
            if (a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }

        }
        System.out.println("The maximum number is "+max);
        System.out.println("The minimum number is "+min);
    }
}

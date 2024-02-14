package Array;
//Find the "Kth" max and min element of an array
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int temp;
        for (int i = 0;i<n; i++) {
            for(int j=i+1;j<n;j++){
                if(a[j]<a[i]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);;
        }

        System.out.println("Enter the kth term");
        int k= sc.nextInt();
        System.out.println("The required max value is "+a[n-k]);
        System.out.println("The required min value is "+a[k-1]);
            
        }
    }


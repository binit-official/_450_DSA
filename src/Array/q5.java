package Array;
import java.util.* ;
import java.io.*;
import java.util.ArrayList;
public class q5 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number of element you want to enter in first arraylist");
            ArrayList<Integer>arr1=new ArrayList<>();
            ArrayList<Integer>arr2=new ArrayList<>();
            int n=sc.nextInt();
            for (int i = 0; i < n; i++) {
                int a=sc.nextInt();
                arr1.add(a);

            }
            System.out.println("Enter number of element you want to enter in second arraylist");
            int m=sc.nextInt();
            for (int i = 0; i < m; i++) {
                int b=sc.nextInt();
                arr2.add(b);

            }
            System.out.println(Intersection(arr1,arr2));

        }

    private static ArrayList<Integer>Intersection(ArrayList<Integer> arr1, ArrayList<Integer> arr2)


   {

            ArrayList<Integer> result = new ArrayList<>();
            int i = 0, j = 0;

            while (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) == arr2.get(j)) {
                    result.add(arr1.get(i));
                    i++;
                    j++;
                } else if (arr1.get(i) < arr2.get(j)) {
                    i++;
                } else {
                    j++;
                }
            }

            return result;
        }
}


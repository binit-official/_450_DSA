package Array;

//Linear search

public class q60 {
    public static int linearSearch(int n, int num, int []arr){
        int c=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                c=i;
                break;
            }
        }
        return c;
    }
}

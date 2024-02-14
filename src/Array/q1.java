package Array;
//Reverse the array
public class q1 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int i=0;
        int j=a.length-1;
        while(j>i){
            int temp;
             temp=a[j];
             a[j]=a[i];
             a[i]=temp;
             i++;j--;
        }
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}

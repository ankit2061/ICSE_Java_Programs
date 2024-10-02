import java.util.*;
public class Bubble_sort_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements of the array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i=0,j=0,temp=0;
        System.out.println("Enter the elements of the array:");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=1;j<(n-i);j++){
                temp=a[j-1];
                a[j-1]=a[j];
                a[j]=temp;
            }
        }
        for(i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}

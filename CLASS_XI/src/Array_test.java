import java.util.*;
public class Array_test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements of the array:");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("THe array elements:");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}

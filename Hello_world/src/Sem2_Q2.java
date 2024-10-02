import java.util.*;
public class Sem2_Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i=0;
        System.out.println("Enter the elements of the array:");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched:");
        int s=sc.nextInt();
        int c=0;
        for(i=0;i<n;i++){
            if(a[i]==s) {
                System.out.println(s + " is found in the array");
                c++;
            }
            if(c==0)
                System.out.println(s+"is not found");
        }
    }
}

import java.util.*;
public class Deleting_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i=0,c=0;
        System.out.println("Enter the elements of the array:");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the position of the character to be deleted:");
        int pos=sc.nextInt();
        for(i=pos;i<n;i++){
            a[i]=a[i+1];
            n--;
        }
        System.out.println("After deleting the value:");
        for(i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}

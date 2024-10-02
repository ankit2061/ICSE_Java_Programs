import java.util.*;
public class Character_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of pockets of the array:");
        int n=sc.nextInt();
        char a[]=new char[n];
        System.out.println("Enter the characters:");
        int i=0;
        for(i=0;i<n;i++)
        {
            a[i]=sc.next().charAt(0);
        }
        System.out.println("Characters in the array:");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}

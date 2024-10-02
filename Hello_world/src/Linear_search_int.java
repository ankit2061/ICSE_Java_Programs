import java.util.*;
public class Linear_search_int {
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
        System.out.println("Enter the value you want to search:");
        int s=sc.nextInt();
        for(i=0;i<n;i++){
            if(s==a[i])
                c++;
        }
        if(c>0)
            System.out.println("Number is present"+" for "+c+" times");
        else
            System.out.println("Number is not present");
    }
}

import java.util.*;
public class Linear_Search_char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        char a[]=new char[n];
        int i=0,c=0;
        System.out.println("Enter the elements of the array:");
        for(i=0;i<n;i++){
            a[i]=sc.next().charAt(0);
        }
        System.out.println("Enter the character you want to search:");
        char s=sc.next().charAt(0);
        for(i=0;i<n;i++){
            if(s==a[i])
                c++;
        }
        if(c>0)
            System.out.println("Character is present"+" for "+c+" times");
        else
            System.out.println("Character is not present");
    }
}

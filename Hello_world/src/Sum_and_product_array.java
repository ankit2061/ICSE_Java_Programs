import java.util.*;
public class Sum_and_product_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int a[] = new int[n];
        int i = 0,s=0,p=1,x=0;
        System.out.println("Enter the elements of array");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(i=0;i<n;i++){
            x=a[i];
            s=s+x%10;
            while(x>9){
                x=x/10;
            }
              p=p*x;
        }
        System.out.println("Sum of last digit of each number is:\t"+s);
        System.out.println("Product of first digit of each number is:\t"+p);
    }
}

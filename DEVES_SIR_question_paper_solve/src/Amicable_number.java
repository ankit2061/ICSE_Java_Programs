import java.util.*;
public class Amicable_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int i=1;
        while (i <= m) {
            if(m % i == 0)
                System.out.print(i+"\t");
            i++;
        }
    }
}

import java.util.*;
public class Max_of_5_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 5 digit number:");
        int n=sc.nextInt();
        int c = 0, max=0, min=9, d;
        while (n != 0)
        {
            d = n % 10;
            n = n / 10;
            if(d>max)
            {
                max=d;
            }
            if(d<min)
            {
                min=d;
            }
        }
        System.out.println("max digit = "+max);
        System.out.println("min digit = "+min);
    }
}

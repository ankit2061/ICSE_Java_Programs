import java.util.*;
public class BinaryToDecimalConvert {
    static int BinaryToDecimal(int n)
    {
        if(n==0)
            return 0;
        else
            return (n% 10 + 2* BinaryToDecimal(n / 10));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the Binary Value:");
        n=sc.nextInt();
        System.out.println("Decimal Value of Binary number is: "+BinaryToDecimal(n));
    }
}
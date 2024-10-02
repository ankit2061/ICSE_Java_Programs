import java.util.*;
class Binary_Decimal
{
    static int toDecimal(String binary,int i)
    {
        int n = binary.length();
        if (i == n-1)
            return binary.charAt(i) - '0';
        else
        return ((binary.charAt(i) - '0') << (n-i-1)) + toDecimal(binary, i+1);
    }
    static int find(int decimal_number)
    {
        if (decimal_number == 0)
            return 0;
        else
            return (decimal_number % 2 + 10 *find(decimal_number / 2));
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Binary number:");
        String binary=sc.nextLine();
        int i=0;
        System.out.println("Decimal number:");
        System.out.println(toDecimal(binary,i));
        System.out.println("Enter a Decimal number:");
        int decimal_number = sc.nextInt();
        System.out.println("Binary number:");
        System.out.println(find(decimal_number));
    }
}
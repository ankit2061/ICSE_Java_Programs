import java.util.*;
class DecimalToOctal
{
    static int find(int decimal_number)
    {
        if (decimal_number == 0)
            return 0;
        else
            return (decimal_number % 8 + 10 * find(decimal_number / 8));
    }
    // Driver Code
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int decimal_number = sc.nextInt();
        System.out.println(find(decimal_number));
    }

}



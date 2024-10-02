import java.util.Scanner;
public class Disarium_number_recursive
{
    int num,size;
    Disarium_number_recursive(int n)
    {
        num=n;
        size=0;
    }
    void countDigits()
    {
        int temp=num;
        while(temp>0)
        {
            temp=temp/10;
            size++;
        }
    }
    int sumofDigits(int n,int p)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return (int)Math.pow((n%10),p) +sumofDigits((n/10),(p-1));
        }
    }
    void check()
    {
        if(sumofDigits(num,size)==num)
        {
            System.out.println(num+" is a Disarium number");
        }
        else
        {
            System.out.println(num+" is not a Disarium number");
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a Number");
        int number=sc.nextInt();
        Disarium_number_recursive ob1=new Disarium_number_recursive(number);
        ob1.countDigits();
        ob1.check();
    }
}
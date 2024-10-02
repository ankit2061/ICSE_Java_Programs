package Common_recursion_progs;

import java.util.Scanner;
public class Reverse
{
    int d=0,r=0;

    int rev_no(int n){
        if(n==0)
            return r;
        else {
            d=n%10;
            r=r*10+d;
            n=n/10;
            return rev_no(n);
        }
    }
    void rev_s(String str){
            if ((str=="")||(str.length() <= 1))
                System.out.println(str);
            else
            {
                System.out.print(str.charAt(str.length()-1));
                rev_s(str.substring(0,str.length()-1));
            }
        ;
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be reversed:");
        int rn =sc.nextInt();
        System.out.println("The reverse of "+ rn +" is: "+rev_no(rn));

    }
    void input1(){
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the String to be reversed:");
        String rs=sc1.nextLine();
        System.out.print("The reverse of "+rs+" is:");
        rev_s(rs);
    }
    public static void main(String[] args) {
        Reverse ob=new Reverse();
        ob.input();
        ob.input1();
    }
}

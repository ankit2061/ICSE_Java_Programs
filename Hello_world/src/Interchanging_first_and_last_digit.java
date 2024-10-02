import java.util.*;
public class Interchanging_first_and_last_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0,d=0,p=0;
        System.out.print("Enter a number:\t");
        int n=sc.nextInt();
        int n1=n;
        d=n%10;//selects last digit
        while(n>=10){
            n=n/10;//selects first digit
            c=c+1;//counts the number of middle digits
        }
        n1=n1/10;
        n1=n1*10;
        p=n1%(int)Math.pow(10,c);//selects middle digits between the first and the last
        System.out.print("Number after interchanging first and last digits: ");
        System.out.println(d*(int)Math.pow(10,c)+p+n);
    }
}

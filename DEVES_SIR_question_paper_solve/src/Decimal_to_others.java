import java.util.*;
public class Decimal_to_others {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number in decimal:");
        int n=sc.nextInt();
        int n1=n;
        int i=0,o=0,r=0,b=0,c=0;
        System.out.print(n+" in binary = ");
        while(n>0){
            b=n%2;
            n=n/2;
            System.out.print(b);
        }
        System.out.println();
        int n2=n1;
        while(n1>0) {
            int temp= (int) ((n1%8) * Math.pow(10, c));
            c++;
            r+=temp;
            n1=n1/8;
        }
        System.out.println(n2+" in octadecimal = "+r);
        int n3=n2;
        int temp=0;
        String h="";
        char hexdec[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(n3>0)
        {
            temp=n3%16;
            h=hexdec[temp]+h;
            n3=n3/16;
        }
        System.out.println(n3+" in hexadecimal = "+h);
    }
}

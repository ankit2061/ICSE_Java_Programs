/*
A Prime-Adam integer is a positive integer (without leading zeros) which is a prime as well as an Adam number.

Prime number: A number which has only two factors, i.e. 1 and the number itself.

Example: 2, 3, 5, 7 ... etc.

Adam number: The square of a number and the square of its reverse are reverse to each other.

Example: If n = 13 and reverse of 'n' = 31, then,

(13)2 = 169

(31)2 = 961 which is reverse of 169

thus 13, is an Adam number.

Accept two positive integers m and n, where m is less than n as user input. Display all Prime-Adam integers that are in
the range between m and n (both inclusive) and output them along with the frequency, in the format given below:

Test your program with the following data and some random data:

Example 1

INPUT:
m = 5
n = 100

OUTPUT:
THE PRIME-ADAM INTEGERS ARE:
11 13 31
FREQUENCY OF PRIME-ADAM INTEGERS IS: 3
 */
package ISC_2020;
import java.sql.SQLOutput;
import java.util.*;
public class Q1_PrimeAdam {
    int m, n;

    Q1_PrimeAdam(int mm, int nn) {
        m=mm;
        n=nn;

    }
    int Prime_check(int no){
        int c=0;
        for(int i=1;i<=no/2;i++){
            if(no%i==0)
                c++;
        }
        if(c==1)
            return 1;
        return 0;
    }
    int adam_no(int n){
        String s=Integer.toString(n);
        StringBuffer sb=new StringBuffer(s);
        String s1=sb.reverse().toString();
        int rev=Integer.parseInt(s1);
        int nsq=n*n;
        int revsq=rev*rev;
        StringBuffer sb1=new StringBuffer(Integer.toString(revsq));
        if(nsq==Integer.parseInt(sb1.reverse().toString()))
            return 1;
        return 2;
    }
    void check(){
        System.out.println("THE PRIME-ADAM INTEGERS ARE:");
        int f=0;
        for(int i=m;i<=n;i++)
        {
            if(Prime_check(i)==1&&adam_no(i)==1) {
                System.out.print(i+" ");
                f++;
            }
        }
        System.out.println();
        System.out.println("FREQUENCY OF PRIME-ADAM INTEGERS IS: "+f);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of m and n:");
        int m1=sc.nextInt();
        int n1=sc.nextInt();
        if(!(m1<n1)){
            System.out.println("Invalid input.");
            System.exit(0);
        }
        Q1_PrimeAdam ob=new Q1_PrimeAdam(m1,n1);
        ob.check();
    }
}

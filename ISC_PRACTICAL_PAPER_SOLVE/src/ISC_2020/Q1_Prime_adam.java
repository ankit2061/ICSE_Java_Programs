package ISC_2020;
/*
A Prime-Adam integer is a positive integer (without leading zeros) which is a prime as well as an Adam number.

Prime number: A number which has only two factors, i.e. 1 and the number itself.

Example: 2, 3, 5, 7 ... etc.

Adam number: The square of a number and the square of its reverse are reverse to each other.

Example: If n = 13 and reverse of 'n' = 31, then,

(13)2 = 169

(31)2 = 961 which is reverse of 169

thus 13, is an Adam number.

Accept two positive integers m and n, where m is less than n as user input. Display all Prime-Adam integers that are in the range between m and n (both inclusive) and output them along with the frequency, in the format given below:
 */
import java.util.*;
public class Q1_Prime_adam
{
    static int m,n;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of m and n:");
        m=sc.nextInt();
        n=sc.nextInt();
    }
    int isprime(int nu){
        int c=0;
        for(int j = 2; j<= nu /2; j++){
            if(nu %j==0){
                c++;
            }
        }
        if(c==0){
            return 1;
        }
        else
            return 0;
    }
    int adam_check(int no){
        String nn=Integer.toString(no);
        StringBuffer sb=new StringBuffer(nn);
        int no_r=Integer.parseInt(sb.reverse().toString());
        no_r=no_r*no_r;
        no=no*no;
        nn=Integer.toString(no_r);
        StringBuffer sb1=new StringBuffer(nn);
        if(Integer.toString(no).equals(sb1.reverse().toString())){
            return 1;
        }
        else return 0;
    }
    void calc(){
        int c=0;
        System.out.println("THE PRIME-ADAM INTEGERS ARE:");
        for(int i=m;i<=n;i++){
            if(isprime(i)==1&&adam_check(i)==1){
                System.out.print(i+" ");
                c++;
            }
        }
        System.out.println("\nFREQUENCY OF PRIME-ADAM INTEGERS IS: "+c);
    }
    public static void main(String[] args) {
        Q1_Prime_adam ob=new Q1_Prime_adam();
        ob.input();
        if(m<n) {
            ob.calc();
        }
        System.out.println("Invalid Input");
    }
}

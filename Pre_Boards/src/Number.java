import java.util.*;
public class Number {
    public static void main(String[] args) {
        int M=0,N=0,sum=0,l=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of M and N:");
        M=sc.nextInt();
        N=sc.nextInt();
        if(!(M>=100&&M<=10000&&N<100)){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        do{
            sum=0;
            M++;
            String s=Integer.toString(M);
            l=s.length();
            for(int i=0;i<l;i++){
                char ch=s.charAt(i);
                sum+=Integer.parseInt(Character.toString(ch));
            }
        }while(sum!=N);
        System.out.println("OUTPUT: "+M);
        System.out.println("Total Number of digits: "+l);
    }
}

import java.util.*;
public class Q1 {
    int M,N;
    Q1(){
        M=0;
        N=0;
    }
    void input(){
        Scanner sc=new Scanner(System.in);{
            System.out.println("Enter the values of M and N:");
            M=sc.nextInt();
            N=sc.nextInt();
            if(!(M>=100&&M<10000&&N<100)){
                System.out.println("Invalid Input");
                System.exit(0);
            }
        }
    }
    void calc(){
        int sum=0;
        int l=0;
        do{
            sum=0;
            M++;
            String s=Integer.toString(M);
            l=s.length();
            for (int i = 0; i < l; i++) {
                char ch = s.charAt(i);
                sum +=Integer.parseInt(Character.toString(ch));
            }
        }while(sum!=N);
        System.out.println("Output: "+M);
        System.out.println("Total number of digits: "+l);
    }

    public static void main(String[] args) {
        Q1 ob=new Q1();
        ob.input();
        ob.calc();
    }
}

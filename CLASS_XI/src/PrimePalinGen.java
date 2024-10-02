import java.util.*;
public class PrimePalinGen {
    int start,end;
    PrimePalinGen(int a,int b){
        start=a;
        end=b;
    }
    int isprime(int i){
        int c=0;
        for(int j=2;j<=i/2;j++){
            if(i%j==0){
                c++;
            }
        }
        if(c==0){
            return 1;
        }
        else
            return 0;
    }
    int isPalin(int i){
        String s=Integer.toString(i);
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        String s1=sb.toString();
        if(s.equals(s1))
            return 1;
        else
            return 0;
    }
    void generate(){
        for(int i=start;i<end;i++){
            if(isprime(i)==1&&isPalin(i)==1){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the start and end of the range:");
        int s=sc.nextInt();
        int l=sc.nextInt();
        PrimePalinGen ob=new PrimePalinGen(s,l);
        ob.generate();
    }
}

package ISC2024_SPECIMEN_PAPER;
import java.util.*;
public class Evil {
    int num;
    String bin;
    Evil(){
        num=0;
        bin="";
    }
    void acceptNum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
            num=sc.nextInt();
    }
    void rec_bin(int x){
        if(x!=0){
            bin=bin+x%2;
            rec_bin(x/2);
        }
    }
    void check(){
        int c=0;
        rec_bin(num);
        for(int i=0;i<bin.length();i++){
            char ch=bin.charAt(i);
            if(ch=='1')
                c++;
        }
        if(c%2==0)
            System.out.println(num+" is evil number.");
        else
            System.out.println(num+" is not evil number.");
    }

    public static void main(String[] args) {
        Evil ob=new Evil();
        ob.acceptNum();
        ob.check();
    }
}

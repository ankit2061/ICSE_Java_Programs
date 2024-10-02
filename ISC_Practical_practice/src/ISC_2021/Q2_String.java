package ISC_2021;
import java.util.*;
public class Q2_String
{
    String s,sent[],words1[],words2[];
    Q2_String(){
        s="";
        sent=new String[2];
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the paragraph containing two sentences:");
        s=sc.nextLine();
        s=s.toUpperCase();
        String s1="";
        int f=0,j=0,i=0;
        for(i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='.'||c=='?'||c=='!')
            {
                f++;
                s1=s.substring(j,i+1);
                sent[f-1]=s1;
                j=i+1;
            }
        }
        if(f>2){
            System.out.println("Invalid input");
            System.exit(0);
        }
    }

    void check(){
        System.out.println("THE SENTENCES ARE:");
        System.out.println(sent[0]);
        System.out.println(sent[1]);
        sent[0]=sent[0].substring(0,sent[0].length()-1);
        sent[1]=sent[1].substring(0,sent[1].length()-1);
        words1=sent[0].split(" ");
        words2=sent[1].split(" ");
        System.out.println("COMMON WORDS \t"+"FREQUENCY");
        int c=1;
        //System.out.println(":I:   "+words1[words1.length-1]);
        for(int i=0;i<words1.length;i++){
            for(int j=i+1;j<words2.length-1;j++){
                if(words1[i].equals(words2[j])||words1[i].equals(words1[j]))

                {
                c++;
                }
            }
            if(c>1) {
                System.out.println(words1[i] + "\t \t \t \t \t" + c);
                c = 0;
            }
        }
    }
    public static void main(String[] args) {
        Q2_String ob=new Q2_String();
        ob.input();
        ob.check();
    }
}

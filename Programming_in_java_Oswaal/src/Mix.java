import java.util.*;
public class Mix {
    String wrd;
    int len;
    Mix(){
        wrd="";
        len=0;
    }
    void feedword(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word:");
        wrd=sc.nextLine().toUpperCase();
        len=wrd.length();
    }
    void mix_word(Mix P,Mix Q){
        int s=(P.len <Q.len)? P.len:Q.len;
        for(int i=0;i<s;i++)
            wrd += P.wrd.charAt(i)+""+Q.wrd.charAt(i);
        if (P.len > Q.len)
            wrd +=P.wrd.substring(Q.len);
        else
            wrd +=Q.wrd.substring(P.len);
    }
    void display(){
        System.out.println("OUTPUT: "+wrd);
    }
    public static void main(String[] args) {
        Mix ob1=new Mix();
        Mix ob2=new Mix();
        Mix ob=new Mix();
        ob1.feedword();
        ob2.feedword();
        ob.mix_word(ob1,ob2);
        ob.display();
    }
}

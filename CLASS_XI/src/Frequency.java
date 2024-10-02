import java.util.*;
public class Frequency {
    int countan,countand,len;
    String text;
    public Frequency(){
        countan=0;
        countand=0;
        len=0;
        text="";
    }
    void accept(String n){
        text=n.toLowerCase();
        text=text+" ";
        len=text.length();
    }
    void checkandfreq(){
        String s1="";
        int j=0;
        for(int i=0;i<len;i++){
            char ch=text.charAt(i);
            if (ch == ' ') {
                s1=text.substring(j,i);
                j=i+1;
                if(s1.equals("and"))
                    countand++;
            }
        }
    }
    void checkanfreq(){
        String s1="";
        int j=0;
        for(int i=0;i<len;i++){
            char ch=text.charAt(i);
            if (ch == ' ') {
                s1=text.substring(j,i);
                j=i+1;
                if(s1.equals("an"))
                    countan++;
            }
        }
    }
    void display(){
        System.out.println("The frequency of and in the sentence is: "+countand);
        System.out.println("The frequency of an in the sentence is: "+countan);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        Frequency ob=new Frequency();
        ob.accept(str);
        ob.checkandfreq();
        ob.checkanfreq();
        ob.display();
    }
}

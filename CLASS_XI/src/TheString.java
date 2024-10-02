import java.util.Locale;
import java.util.Scanner;

public class TheString {
    String str,str1;
    int len,wordcount,cons;
    public TheString(){
        str="";
        str1="";
        len=0;
        wordcount=0;
        cons=0;
    }
    public TheString(String ds){
        str=ds;
        str1=str;
        str=str+" ";
        len=str.length();
        wordcount=0;
        cons=0;
    }
    public void CountFreq(){
        char ch;
        str=str.toLowerCase();
        for(int i=0;i<len;i++){
            ch=str.charAt(i);
            if(ch==' ')
                wordcount++;
            if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch==' '))
                cons++;
        }
    }
    public void display(){
        System.out.println("The original String: "+str1);
        System.out.println("Number of words in the String: "+wordcount);
        System.out.println("The number of consonants: "+cons);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.nextLine();
        TheString ob=new TheString(s);
        ob.CountFreq();
        ob.display();
    }
}

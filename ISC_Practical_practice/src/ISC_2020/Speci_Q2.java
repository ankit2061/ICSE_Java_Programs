package ISC_2020;
import java.util.*;
public class Speci_Q2
{
    String s,words[];
    int w,pot[];
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        s=sc.nextLine();
        if(!(s.charAt(s.length()-1)=='.'||s.charAt(s.length()-1)=='?'||s.charAt(s.length()-1)=='!'))
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        s=s.toUpperCase();
    }
    void Div(){
        s=s.substring(0,s.length()-1);
        s=s+" ";
        StringTokenizer st=new StringTokenizer(s);
        w=st.countTokens();
        pot=new int[w];
        words=new String[w];
        words=s.split(" ");
    }
    void calc(){
        int p=0;
        for(int i=0;i<w;i++){
            p=0;
            for(int j=0;j< words[i].length();j++){
                p+=words[i].charAt(j);
            }
            pot[i]=p;
        }
    }
    void display1(){
        for(int i=0;i<w;i++){
            System.out.println(words[i]+"="+pot[i]);
        }
    }
    void bubblesort(){
        String tempwords="";
        for(int i=0;i<w-1;i++){
            for(int j=0;j<w-1-i;j++){
                if(pot[j]>pot[j+1]){
                    int temp=pot[j];
                    tempwords=words[j];
                    pot[j]=pot[j+1];
                    words[j] =words[j+1];
                    pot[j+1]=temp;
                    words[j+1]= tempwords;
                }
            }
        }


    }
    void display2(){
        for(int i=0;i<w;i++) {
            System.out.print(words[i] + " ");
        }
    }


    public static void main(String[] args) {
        Speci_Q2 ob=new Speci_Q2();
        ob.input();
        ob.Div();
        ob.calc();
        ob.display1();
        ob.bubblesort();
        ob.display2();
    }

}

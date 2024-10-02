package ISC_2021;
import java.util.*;
public class Q2_Speci
{
    String s,words[],s1;
    Q2_Speci(){
        s="";
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence:");
        s=sc.nextLine();
        //s=s.toUpperCase();
        int l=s.length();
        char c=s.charAt(l-1);
        if(!(c=='.'||c=='?'||c=='!')){
            System.out.println("Invalid input");
            System.exit(0);
        }
        s1=Character.toUpperCase(s.charAt(0))+s.substring(1,s.length()-1)+".";
        s=s.substring(0,l-1);
        words=s.split(" ");
    }
    void bubblesort(){

        int n= words.length;
        String temp="";
        for(int i=0;i<n;i++){
            for(int j=1;j<(n-i);j++){
                if(words[j-1].length()>words[j].length()){
                    temp=words[j-1];
                    words[j-1]=words[j];
                    words[j]=temp;
                }
                if(words[j-1].length()==words[j].length()){
                    int c=words[j].compareTo(words[j-1]);
                    if(c>0){
                        temp=words[j];
                        words[j]=words[j-1];
                        words[j-1]=temp;
                    }
                }
            }
        }
    }
    void display(){
        String nw ="";
        System.out.println("OUTPUT:");
        System.out.println(s1);
        for(int i=0;i<words.length;i++){
            nw +=words[i]+" ";
        }
        System.out.println(Character.toUpperCase(nw.charAt(0))+ nw.substring(1, nw.length()-1)+".");
    }
    public static void main(String[] args) {
        Q2_Speci ob =new Q2_Speci();
        ob.input();
        ob.bubblesort();
        ob.display();
    }
}

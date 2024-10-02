import java.util.*;
public class Reverse_each_word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        s=s+" ";
        String s1="";
        char ch;
        int l=s.length();
        int i=0,j=0,k=0,c=0;
        for(i=0;i<l;i++){
            ch=s.charAt(i);
            if(ch==' '){
                c++;
            }
        }
        String words[]=new String[c];
        for(i=0;i<l;i++){
            ch=s.charAt(i);
            if(ch==' '){
                s1=s.substring(j,i);
                int l1=s1.length();
                words[k]=s1;
                k++;
                j=i+1;
            }
        }
        System.out.println("Reversed word:");
        int n= words.length;
        for(i=(n-1);i>=0;i--)
        System.out.print(words[i]+" ");
    }
}

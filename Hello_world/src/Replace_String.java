import java.util.*;
public class Replace_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s= sc.nextLine();
        System.out.println("Enter the String you want to replace:");
        String olds=sc.nextLine();
        System.out.println("Enter the String you want to replace with:");
        String news=sc.nextLine();
        //System.out.println(s.replaceAll(olds,news));
        int c=0;
        s=s+" ";
        int l=s.length(),k=0;
        for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            if(ch==' ')
                c++;
        }
        String[] words = new String[c];String word="";
        for(int i = 0; i < l; i++){
            if(s.charAt(i) != ' '){
                word = word + s.charAt(i);
            }
            else{
                words[k] = word;
                k++;
                word = "";
            }
        }
        System.out.println("Corrected String:");
        String s1="";
        for(int i=0;i<l;i++){
            if(words[i].equalsIgnoreCase(olds))
                words[i]=news;
            System.out.print(words[i]+" ");
        }
    }
}

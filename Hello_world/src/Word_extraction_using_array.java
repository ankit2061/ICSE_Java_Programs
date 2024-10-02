import java.util.*;
public class Word_extraction_using_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s =sc.nextLine(),words[]=new String[100],word="";
        s=s+" ";
        int i=0,j=0;
        for(i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                word=word+ch;
            }
            else{
                words[j]=word;
                j++;
                word="";
            }
        }
        for(i=0;i< words.length;i++){
            System.out.println(words[i]);
        }
    }
}

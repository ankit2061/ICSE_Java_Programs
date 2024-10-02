/*Accept a String. Find the frequency of each pairs which are having consecutive letters.eg
AB or CD etc*/
import  java.io.*;
public class String_frequency {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String:");
        String s=br.readLine();
        int l=s.length();
        int i=0,c=0;
        String s1="";
        for(i=0;i<l-1;i++){
            char ch=s.charAt(i);
            char ch1=s.charAt(i+1);
            if(ch+1==ch1){
                s1=s1+ch+ch1;
                System.out.println(s1);
                c++;
            }
            s1="";
        }
        System.out.println("Frequency of consecutive pair:\t"+c);
    }
}

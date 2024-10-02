import java.io.*;
public class Double_letters_copy
{
    public static void main(String[] args)throws  IOException
    {
        int l=0,i=0,c=0;
        char ch,ch1;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string:");
        String s= br.readLine();
        s=s.toUpperCase();
        l=s.length();
        System.out.println("length: "+l);
        System.out.print("Double sequence: ");
        for(i=0;i<l-1;i++){
            ch=s.charAt(i);
            ch1=s.charAt(i+1);
            if(ch==ch1) {
                c++;
                System.out.print(ch1+" ");
            }
        }
        System.out.println();
        System.out.println("No. of double sequence: "+c);
    }
}

import java.io.*;
public class Words_starting_with_vowels {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a sentence: ");
        String str=br.readLine();
        str = str + " ";
        String str3 = str.toLowerCase();
        int l=str.length();
        int position=0;
        char ch1, ch2;
        String str2 = "";//null string
        for(int i=0; i<l; i++)
        {
            ch1 = str.charAt(i);
            if(ch1 == ' ')
            {
                str2 = str3.substring(position,i);
                ch2 = str2.charAt(0);
                if(ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u')
                {
                            System.out.println(str2);
                }
                        position = i+1;
            }

        }

    }
}

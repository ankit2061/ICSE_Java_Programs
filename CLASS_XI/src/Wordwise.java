import java.util.*;
public class Wordwise
{
    String str;
    Scanner sc=new Scanner(System.in);
    Wordwise(){
        str="";
    }
    void readsent(){
        System.out.println("Enter a sentence:");
        str=sc.nextLine();
    }
    int freq_vowel(String w){
        int f=0;
        w=w.toLowerCase();
        for(int i=0;i<w.length();i++){
            char ch=w.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                f++;
        }
        return f;
    }
    /*void arrange(){
        String words[];
        words=str.split(" ");
        int Vowel_count[]=new int[words.length];
        for(int i=0;i<words.length;i++){
            Vowel_count[i]=freq_vowel(words[i]);
        }
        int temp = 0;
        String tempw="";
        int n=str.length();
        for(int i=0; i < n; i++)
        {
            for(int j=1; j < (n-i); j++)
            {
                if(Vowel_count[j-1] > Vowel_count[j])
                {
                    temp = Vowel_count[j-1];
                    Vowel_count[j-1] = Vowel_count[j];
                    Vowel_count[j] = temp;
                    tempw = words[j-1];
                    words[j-1] = words[j];
                    words[j] = tempw;
                }
            }
        }
        //System.out.println("Words of the sentence in ascending order of frequency of vowels:");
        System.out.println("Words"+"\t"+"Frequency");
        for(int i=0;i< words.length;i++){
            System.out.println(words[i]+"\t"+Vowel_count[i]);
        }
    }*/
    void arrange(){
        String words[];
        words=str.split(" ");
        for(int i=0;i< words.length;i++){
            System.out.println(words[i]+"\t"+freq_vowel(words[i]));
        }
    }
    public static void main(String[] args) {
        Wordwise ob=new Wordwise();
        ob.readsent();
        ob.arrange();
    }
}

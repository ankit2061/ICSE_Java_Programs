import java.util.*;
public class Count_Consonants
{
    String s;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        s=sc.nextLine();
    }
    void count(){
        s=s.toLowerCase();
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(!(ch =='a'|| ch =='e'|| ch =='i'|| ch =='o'|| ch =='u'||ch==' '))
                c++;
        }
        System.out.println("Number of consonants in the sentence= "+c);
    }
    public static void main(String[] args) {
        Count_Consonants ob=new Count_Consonants();
        ob.input();
        ob.count();
    }
}

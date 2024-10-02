import java.util.*;
public class Stringfun
{
    String str;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        str=sc.nextLine();
    }
    void words(){
        StringTokenizer st=new StringTokenizer(str);
        System.out.println("Number of words= "+st.countTokens());
        int cu=0,cv=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch))
                cu++;
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                cv++;
        }
        System.out.println("Number of vowels= "+cv);
        System.out.println("Number of Uppercase letters= "+cu);
    }
    void frequency(){
        str=str.toLowerCase();
        int c=0;
        char cha[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(cha[i]==cha[j])
                    c++;
            }
            System.out.println(cha[i]+" is present for "+c+" times.");
            c=0;
        }
    }
    public static void main(String[] args) {
        Stringfun ob=new Stringfun();
        ob.input();
        ob.words();
        ob.frequency();
    }
}

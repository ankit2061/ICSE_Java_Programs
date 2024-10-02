import java.util.*;
public class Vowel_frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s=sc.nextLine();
        s=s+" ";
        String s1;
        int l=s.length();
        int i=0,j=0,k=0,c=0,l1=0;
        char ch,ch1;
        for(i=0;i<l;i++){
            ch=s.charAt(i);
            if(ch==' ') {
                s1 = s.substring(j, i);
                j=j+1;
                c=0;
                l1=s1.length();
                for(k=0;k>l1;k++){
                    ch1=s1.charAt(k);
                    if(ch1=='a'|| ch1=='e'|| ch1=='i'|| ch1=='o'|| ch1=='u'|| ch1=='A'|| ch1=='E'|| ch1=='I'|| ch1=='O'|| ch1=='U'){
                        c++;
                    }
                }
                System.out.println(s1+"\t"+"\t"+c);
            }
        }
    }
}
/*

 */
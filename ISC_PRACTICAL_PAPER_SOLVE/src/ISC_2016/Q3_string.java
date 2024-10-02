package ISC_2016;
import java.util.*;
public class Q3_string {
    static String s, words[],s1,words_2[];
    int a[],l;
    String s11;
    static Scanner sc=new Scanner(System.in);
    void input(){
        System.out.println("Enter a sentence:");
        s=sc.nextLine();
        s1=s.substring(0,s.length()-1);
        System.out.println(s1);
        s=s1+" ";
        words=s.split(" ");
        l=words.length;
        words_2=new String[l];
    }
    boolean vowel_check(char ch) {
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        else
            return false;
    }
    void count_vowel(){
        int c=0;
        s1="";
        for(int i=0;i<l;i++){
            char chf=words[i].charAt(0);
            char chl=words[i].charAt(l-1);
            if(vowel_check(chf)==true&&vowel_check(chl)==true) {
                words_2[i] = words[i];
                s11=words[i]+" ";
                c++;
            }
        }
        System.out.println("Word that begins and ends with vowel= "+c);
        for(int i=0;i<l;i++){
            for(int j = 0; j <l; j++){
                if(!(words[i].equals (words_2[j])))
                    s11=words[i]+" ";
            }
        }
    }
    /*void sort() {
        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    String temp_s = words[j];
                    a[j] = a[j + 1];
                    words[j] = words[j + 1];
                    a[j + 1] = temp;
                    words[j + 1] = temp_s;
                }
            }
        }
    }*/
    void print(){
        System.out.println(s11);
    }
    public static void main(String[] args) {
        Q3_string ob=new Q3_string();
            ob.input();
        if(s.charAt(s.length())=='.'||s.charAt(s.length())=='!'||s.charAt(s.length())=='?') {
            ob.count_vowel();
            ob.print();
        }
        else
            System.out.println("Invalid output");
    }
}

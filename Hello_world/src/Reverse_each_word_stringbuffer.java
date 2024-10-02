import java.util.*;
public class Reverse_each_word_stringbuffer {
    String s,words[];
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        s=sc.nextLine();
    }
    void splitandreverse(){
        words=s.split(" ");
        System.out.println("Reversed sentence:");
        for(int i=0;i< words.length;i++){
            StringBuffer st=new StringBuffer(words[i]);
            System.out.print(st.reverse()+" ");
        }
    }
    public static void main(String[] args) {
        Reverse_each_word_stringbuffer ob=new Reverse_each_word_stringbuffer();
        ob.input();
        ob.splitandreverse();
    }
}

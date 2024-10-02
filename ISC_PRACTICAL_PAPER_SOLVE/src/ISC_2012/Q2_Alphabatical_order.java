package ISC_2012;
/*
Write a program to accept a sentence as input. The words in the string are to be separated by a blank.
Each word must be in upper case. The sentence is terminated by either '.','!' or '?'.
Perform the following tasks:
Obtain the length of the sentence (measured in words)
Arrange the sentence in alphabetical order of the words.
 */
import java.util.*;
public class Q2_Alphabatical_order {
    String s,words[];
    int l;
    static Scanner sc=new Scanner(System.in);
    void input(){
        System.out.println("Enter a sentence:");
        s=sc.nextLine();
        int l1 =s.length();
        if(!(s.charAt(l1 -1)=='?'||s.charAt(l1 -1)=='.'||s.charAt(l1 -1)=='!')){
            System.out.println("Invalid input");
            System.exit(0);
        }
        s=s.substring(0, l1 -1);
        s=s+" ";
        words=s.split(" ");

        l = words.length;
    }
    void calc(){
        String temp;
        for(int i=1;i<l;i++){
            for(int j=0;j<l-i;j++){
                if(words[j].compareTo(words[j+1]) > 0){
                    temp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp;
                }
            }
        }
    }
    void print(){
        System.out.println("Length= "+l);
        System.out.println("Rearranged Sentence:");
        for(int i=0;i<l;i++)
            System.out.print(words[i]+" ");
        //System.out.println(".");
    }

    public static void main(String[] args) {
        Q2_Alphabatical_order ob=new Q2_Alphabatical_order();
        ob.input();
        ob.calc();
        ob.print();
    }
}

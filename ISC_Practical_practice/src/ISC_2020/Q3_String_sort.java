/*
Write a program to accept a sentence which may be terminated by either '.', '?' or '!' only. The words are to be separated by a single blank space and are in UPPER CASE.

Perform the following tasks:

Check for the validity of the accepted sentence only for the terminating character.
Arrange the words in ascending order of their length. If two or more words have the same length, then sort them alphabetically.
Display the original sentence along with the converted sentence.
Test your program for the following data and some random data:

Example 1:

INPUT:
AS YOU SOW SO SHALL YOU REAP.

OUTPUT:
AS YOU SOW SO SHALL YOU REAP.
AS SO SOW YOU YOU REAP SHALL
 */
package ISC_2020;
import java.util.*;
public class Q3_String_sort
{
    String s,words[];
    Q3_String_sort(){
        s="";
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence:");
        s=sc.nextLine();
        s=s.toUpperCase();
        int l=s.length();
        char c=s.charAt(l-1);
        if(!(c=='.'||c=='?'||c=='!')){
            System.out.println("Invalid input");
            System.exit(0);
        }
        s=s.substring(0,l-1);
        words=s.split(" ");
    }
    void bubblesort(){
        int n= words.length;
        String temp="";
        for(int i=0;i<n;i++){
            for(int j=1;j<(n-i);j++){
                if(words[j-1].length()>words[j].length()){
                    temp=words[j-1];
                    words[j-1]=words[j];
                    words[j]=temp;
                }
                if(words[j-1].length()==words[j].length()){
                    int c=words[j-1].compareTo(words[j]);
                    if(c>0){
                        temp=words[j-1];
                        words[j-1]=words[j];
                        words[j]=temp;
                    }
                }
            }
        }
    }

    void display(){
        System.out.println("Output:");
        for(int i=0;i<words.length;i++)
            System.out.print(words[i]+" ");
    }

    public static void main(String[] args) {
        Q3_String_sort ob =new Q3_String_sort();
        ob.input();
        ob.bubblesort();
        ob.display();
    }
}

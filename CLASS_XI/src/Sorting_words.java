/*
*QUESTION*
* WAP in java to take input of a sentence. Sort the words of the sentence in ascending words.Print the largest word.
 */
import java.util.*;
public class Sorting_words
{
    String words[];
    void split_words(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text=sc.nextLine();
        words=text.split(" ");
    }
    void sort(){
        String temp = "";
        int n=words.length;
        for(int i=0; i < n; i++)
        {
            for(int j=1; j < (n-i); j++) {
                if (words[j - 1].length() > words[j].length()) {
                    temp = words[j - 1];
                    words[j - 1] = words[j];
                    words[j] = temp;
                }
            }
        }
    }
    void display(){

        for(int i=0;i<words.length;i++)
            if(!(words[i].equals("")))
            System.out.println(words[i]);
    }
    void largest_word(){
        for(int i= words.length-1;i>0;i--){
            if(!(words[i].length()==words[i-1].length())) {
                words[i - 1] ="";
            }
        }
    }
    public static void main(String[] args) {
        Sorting_words obj=new Sorting_words();
        obj.split_words();
        obj.sort();
        System.out.println("Sorted Senetence:");
        obj.display();
        obj.largest_word();
        System.out.println("The largest word:");
        obj.display();
    }
}

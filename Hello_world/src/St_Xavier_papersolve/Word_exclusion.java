package St_Xavier_papersolve;
/*
Question:
Input a sentence and a word. Print the output after excluding that word from the sentence (if found).
A variable description table is to be written.
Sample Input: Rahul has worked very hard. His performance is very good.
Keyword: very
Sample Output: Rahul has worked hard. His performance is good.
 */
import java.util.*;
public class Word_exclusion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence from which you want to exclude a word:");
        String sentence=sc.nextLine();
        sentence=sentence+' ';
        System.out.println("Enter the word you want to exclude from the sentence:");
        String word=sc.nextLine();
        int length=word.length();
        String each_word[]=sentence.split(" ");
        int l= each_word.length;
        int p=0;
        for(int i=0;i<l;i++){
            if(each_word[i].compareTo(word)==0)
                p=i;
        }
        for(int j=0;j<p;j++){
            System.out.print(each_word[j]+" ");
        }
        for(int j=p+1;j<l;j++){
            System.out.print(each_word[j]+" ");
        }
    }
}

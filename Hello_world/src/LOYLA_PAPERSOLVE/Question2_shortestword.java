package LOYLA_PAPERSOLVE;
/*Question:
Input a sentence. Find and print the shortest word. Also print number of consonants of the shortest word,
assuming only alphabets and digits are present in the word, after converting into lowercase.
 */
import java.util.*;
public class Question2_shortestword{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a sentence:");
            String s = sc.nextLine();
            String word = "", small = "";
            int l = 0;
            //Add extra space after s to get the last word in the given s
            s = s + " ";
            int c=0;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)==' ')
                    c++;
            }
            String[] words = new String[c];
            for(int i = 0; i < s.length(); i++){
                //Split the s into words
                if(s.charAt(i) != ' '){
                    word = word + s.charAt(i);
                }
                else{
                    words[l] = word;
                    l++;
                    word = "";
                }
            }
            //Initialize small and large with first word in the s
            small= words[0];
            //Determine smallest and largest word in the s
            for(int k = 0; k < l; k++){
                //If length of small is greater than any word present in the s
                //Store value of word into small
                if(small.length() > words[k].length())
                    small = words[k];
            }
            System.out.println("Smallest word: " + small);
            small=small.toLowerCase();
            int c1=0;
            for(int i=0;i<small.length();i++){
                char ch=s.charAt(i);
                if(ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i'||ch==' ')
                    continue;
                else
                    c1++;
            }
            System.out.println("Number of consonants= "+(c1-1));
        }
}
import java.util.*;
public class Words_in_dictionary_format//not working
{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str=sc.nextLine();
        String s[]=str.split(" ");
        int l=s.length;
        for(int i=0;i<l-1;i++){
            for(int j=0;j<l-1-i;j++){
                if(s[j].compareTo(s[j+i])>0){
                    String temp=s[j];
                    s[j]=s[j+i];
                    s[j+i]=temp;
                }
            }
        }
        for(int i=0;i<l;i++) {
            System.out.println(s[i]);
        }
    }
}

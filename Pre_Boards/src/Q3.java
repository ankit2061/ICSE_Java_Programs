import java.util.*;
public class Q3
{
    String s,words[];
    Q3(){
        s="";
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        s=sc.nextLine();
        int l=s.length();
        char ch=s.charAt(l-1);
        if(!(ch=='.'||ch=='!'||ch=='?')){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        s=s.substring(0,l-1);
        s=s+" ";
        words=s.split(" ");
    }
    void bubblesort() {
        int n = words.length;
        String temp = "";
        int c=0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                     c = words[j - 1].compareTo(words[j]);
                    if (c > 0) {
                        temp = words[j - 1];
                        words[j - 1] = words[j];
                        words[j] = temp;
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
        Q3 ob=new Q3();
        ob.input();
        ob.bubblesort();
        ob.display();
    }
}

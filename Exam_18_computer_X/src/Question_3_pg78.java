import java.util.*;//WAP to accept a string and dispaly the new String after removing all vowels present in it
public class Question_3_pg78 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        s=s+" ";
        String s1="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                continue;
            s1=s1+ch;
        }
        System.out.println(s1);
    }
}

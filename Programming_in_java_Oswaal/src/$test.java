public class $test
{
    public static void main(String[] args) {
        String s="I am Ankit.";
        s=s.substring(0,s.length()-1);
        s=s+" ";
        String words[]=s.split(" ");

        for(int i=0;i<s.length()-1;i++){
            System.out.println(words[i]);
        }
    }
}

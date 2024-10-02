import java.util.StringTokenizer;

public class Testing
{
    public static void main(String[] args) {
        String s="RACECAR";
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        String s1= sb.toString();
        StringTokenizer st=new StringTokenizer(s);
        int l=st.countTokens();
     st.nextToken();
        s= st.nextToken();
        System.out.println(s1);
    }
}

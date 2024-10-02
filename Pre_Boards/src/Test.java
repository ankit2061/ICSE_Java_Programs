public class Test
{
    public static void main(String[] args) {
        int M = 119;
        int sum = 0;
        String s = Integer.toString(M);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            sum +=Integer.parseInt(Character.toString(ch));
        }
        System.out.println("OUTPUT: "+sum);
    }
}

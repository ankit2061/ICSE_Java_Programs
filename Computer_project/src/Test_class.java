import java.io.*;

public class Test_class {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int n141 = Integer.parseInt(br.readLine());
        double rad=((3.14*n141)/180);
        double ans=Math.sin(rad);
        System.out.println("sin "+n141+" = "+ans);

    }
}

import java.io.*;
public class Binary_to_decimal {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the binary number:");
		long n=Integer.parseInt(br.readLine());
		long n1=n;
		int dn=0,i=0;
	    long r;
	    while (n != 0) {
	      r = n % 10;
	      n /= 10;
	      dn += r * Math.pow(2, i);
	      i++;
	    }
		System.out.println("Decimal form of "+n1+" is:\t"+dn);
	}

}

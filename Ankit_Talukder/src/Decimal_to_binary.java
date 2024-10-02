import java.io.*;
public class Decimal_to_binary {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the decimal number");
		int n=Integer.parseInt(br.readLine());
		int i=0,j=0;
		int a[]=new int[n];
		while(n!=0) {
			a[i]=n%2;
			n=n/2;
			i++;
		}
		System.out.print("Binary form of "+n+" is:\t");
		for(j=i-1;j>=0;j--)
			System.out.print(a[j]);
	}

}

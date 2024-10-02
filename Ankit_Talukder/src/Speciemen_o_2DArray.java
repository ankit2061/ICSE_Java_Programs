import java.io.*;
public class Speciemen_o_2DArray {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of rows and number of columns");
		int m=Integer.parseInt(br.readLine());
		int n=Integer.parseInt(br.readLine());
		int a[][]=new int[m][n];
		int i,j=0;
		System.out.println("Enter the values");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				a[i][j]=Integer.parseInt(br.readLine());
			}
		}
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}

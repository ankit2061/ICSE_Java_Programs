import java.io.*;
public class Lowerandupperhalfprint {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a the the no of rows:");
		int m = Integer.parseInt(br.readLine());
		//int n=m;
		int a[][] = new int[m][m];
		int i = 0, j = 0;
		System.out.println("Enter the values");
		for (i = 0; i < m; i++) {
			for (j = 0; j < m; j++) {
				a[i][j] = Integer.parseInt(br.readLine());
			}

		}
	}
}

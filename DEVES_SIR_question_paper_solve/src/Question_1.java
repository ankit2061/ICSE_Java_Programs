 /*Question*:Write a menu driven program to generate pattern as follows
*For choice 1
1
2 * 3
4 * 5 * 6
7 * 8 * 9 * 0
*For choice 2
After accepting the no. of rows from user
If input is 5
5 * * * *
4 # # #
3 * *
2 #
1
*/
import java.io.*;
public class Question_1 {
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your choice:");
		System.out.println("Enter 1 for printing Pattern a");
		System.out.println("Enter 2 for printing Pattern b");
		int ch=Integer.parseInt(br.readLine());
		int i,j=0;
		switch (ch){
			case 1:
				for(i=0;i<=4;i++){
					int x=1;
					for(j=1;j<=i*2-1;j++){
						if(j%2==0)
							System.out.print("*");
						else
							System.out.print(x++%10);
					}
					System.out.println();
				}
				break;
			case 2:
				for(i=5;i>=1;i--){
					System.out.print(i);
					for(j=i-1;j<=1;j--){
						if(i%2==0){
							System.out.print("#");
						}
						else
							System.out.print("*");
					}
					System.out.println();
				}
				break;
			default:
				System.out.println("Invalid Choice");
		}

	}
}

import java.io.*;
public class Diagonally_sum
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the rows of array");
        int m=Integer.parseInt(br.readLine());
        System.out.println("Enter the columns of array");
        int n=Integer.parseInt(br.readLine());
        int ar[][]=new int[m][n];
        System.out.println("Enter the value of 2d array");
        int s=0;
        int i=0,j=0;
        for(i=0;i<m;i++)
        {
          for(j=0;j<n;j++)
          {
             ar[i][j]=Integer.parseInt(br.readLine());
            }
        }
        for(i=0;i<m;i++)
        {
        	j=m-1;
            for(i=0;i<n;i++)
            {
                if(i==j)
                {
                    s=s+ar[i][j];
                    j--;
                }
            }
        }
        System.out.println(s);
    }
 }

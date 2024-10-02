/*
Pattern Structure:
1 2 3 4 5
2 3 4 5
3 4 5
4 5
5
 */
public class Pattern_2 {
    public static void main(String[] args) {
        int i=0,j=0;
        for(i=1;i<=5;i++)//Outer Loop
        {
            for(j=i;j<=5;j++)//Inner Loop
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

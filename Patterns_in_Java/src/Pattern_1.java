/*
Pattern Structure:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */
public class Pattern_1 {
    public static void main(String[] args) {
        int i=0,j=0;
        for(i=1;i<=5;i++)//Outer Loop
        {
            for(j=1;j<=i;j++)//Inner Loop
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

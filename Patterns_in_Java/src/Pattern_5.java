/*
Pattern Structure:
1 2 3 4 5 6 7
1 2 3 4 5
1 2 3
1
 */
public class Pattern_5 {
    public static void main(String[] args) {
        int i=0,j=0;
        for(i=7;i>=1;i=i-2)//Outer Loop
        {
            for(j=1;j<=i;j++)//Inner Loop
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/*
Pattern Structure:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */
public class Pattern_3 {
    public static void main(String[] args) {
        int i=0,j=0,x=0;
        for(i=1;i<=5;i++)//Outer Loop
        {
            for(j=1;j<=i;j++)//Inner Loop
            {
                x++;
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}

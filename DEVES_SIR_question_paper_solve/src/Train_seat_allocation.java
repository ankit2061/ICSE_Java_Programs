/*Question:
Write a program to create an array of train seats in a compartment (max 120 seats).
The price of each seat is Rs. 1,200. A user can book one or more seats. The user enters
 the number of seats he / she wants and enters the names of the people which are stored
in the array.The system displays the number of seats available before asking the user to
book his / her preferred number of seats.Then it displays the total cost incurred by the
user, the names in which the seats are booked and the number of seats available after the
transaction is completed. Then the user is given a prompt to exit or continue booking. If
user opts to exit, then display the entirety of the seats booked in that compartment with
seat numbers (1 - 120).
 */
import java.util.*;
class Rajdhani
{
    public static void main(String args[])
    {
        int n,i,j,x=0,s=0;int m=0;
        Scanner sc=new Scanner(System.in);
        int a[]=new int[120];
        int st[]= new int[120];
        String name[]= new String[120];
        int age[]=new int[120];
        for(i=0;i<120;i++)
            st[i]=i+1;
        while(true)
        {
            System.out.println("The available seats are:-");
            for(i=0;i<120;i++)
            {
                if(st[i]!=0)
                    System.out.print(st[i]+",");
            }
            System.out.println();
            System.out.println("Enter the the number of seats to be booked");
            n=sc.nextInt();
            m=m+n;
            System.out.println("Enter the passenger details");
            for(i=x;i<m;i++)
            {
                sc.nextLine();
                System.out.println("Enter the name");
                name[i]=sc.nextLine();
                System.out.println("Enter the age");
                age[i]=sc.nextInt();
                a[i]=((int)((Math.random()*120)))+1;
                st[a[i]-1]=0;
            }
            x=n;
            System.out.println("Do u want to book any other ticket,if no then press 'n' or 'N'");
            char ch= sc.next().charAt(0);
            if(ch=='n'||ch=='N')
                break;
        }
        System.out.println("The booked ticket history");
        System.out.println("Name of passenger\t age\t seat number");
        for(i=s;i<m;i++)
            System.out.println(name[i]+"\t"+age[i]+"\t"+a[i]);
    }
}
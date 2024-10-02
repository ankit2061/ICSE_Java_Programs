import java.util.*;
public class Diary
{
        String Q[];
        int size;
        int start;
        int end;
        Diary(int max){
                size=max;
                start=0;
                end=0;
                Q=new String[size];
        }
        void pushadd(String n){
                if(end<size-1)
                {
                        Q[end]=n;
                        end++;
                        System.out.println("Address added to the diary");
                }

                else
                {
                        System.out.println("No space.");
                }
        }
        String popadd(){
                String x;
                if(start==end)
                        x="??????";
                else
                {
                        x=Q[start];
                        start++;
                }
                return x;
        }

        void show(){
                if(start==end)
                        System.out.println("Diary empty");
                else {
                        System.out.println("THe addresses in the diary are:");
                        for(int j=end-1;j>=start;j--)
                                System.out.println(Q[j]);
                }
        }
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                Scanner sc1=new Scanner(System.in);
                System.out.println("Enter the capacity of the array:");
                int cap=sc.nextInt();
                Diary obj=new Diary(cap);
                int ch=0;
                String n="";
                while(ch!=4)
                {
                        System.out.println("\n\nEnter 1 to add an address to the diary.");
                        System.out.println("Enter 2 to delete the first address of the diary.");
                        System.out.println("Enter 3 to show elements of the diary.");
                        System.out.println("Enter 4 for exit.");
                        System.out.println("Enter your choice:");
                        ch=sc.nextInt();
                        switch (ch)
                        {
                                case 1:
                                        System.out.println("\nEnter an address to the diary:");
                                        n=sc1.nextLine();
                                        obj.pushadd(n);
                                        break;
                                case 2:
                                        n=obj.popadd();
                                        if(n.equals("??????"))
                                                System.out.println("Diary empty");
                                        else
                                                System.out.println("Element deleted is: "+n);
                                        break;
                                case 3:
                                        System.out.println("Queue status");
                                        obj.show();
                                        break;
                                case 4:
                                        System.out.println("\tPROGRAM TERMINATED");
                                        System.exit(0);
                                default:
                                        System.out.println("Invalid input. Enter 1 to 4 only!!");
                        }
                }

        }
}
import java.util.*;
public class WordPile
{
    char ch[];
    static int capacity,top,f;
    WordPile(int Cap)
    {
        capacity = Cap;
        top = -1;
        ch = new char[capacity];
    }
    void pushChar(char v)
    {
        if(top==capacity-1)
        {
            System.out.println("The WordPile is full");
            f=1;
        }
        else {
            top++;
            ch[top] = v;
        }
    }
    char popChar()
    {
        if(top==-1)
            return'\\';
        else
        {
            return ch[top--];
        }
    }
    void Display()
    {
        System.out.println("The stack contains:");
        for(int i=0; i<capacity; i++)
            System.out.println(ch[i]);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity");
        int c1 = sc.nextInt();
        if(c1>20){
            System.out.println("Capacity must be less than or equal to 20.");
            System.exit(0);
        }
        WordPile ob = new WordPile(c1);
        ob.pushChar('a');
        ob.pushChar('b');
        ob.pushChar('c');
        ob.pushChar('d');
        ob.pushChar('e');
        while(top<=capacity)
        {
            System.out.println("Choose one of the following:");
            System.out.println("1. Push Character");
            System.out.println("2. Pop Character");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the element to be pushed");
                    char element= sc.next().charAt(0);
                    ob.pushChar(element);
                    if(f==1){
                        ob.Display();
                        System.out.println("Choose one of the following:");
                        System.out.println("1. Pop character:");
                        System.out.println("2. Exit the stack:");
                        int ch=sc.nextInt();
                        switch (ch){
                            case 1:
                                char pop = ob.popChar();
                                System.out.println(pop+" popped.");
                                break;
                            case 2:
                                System.out.println("Stack Exited");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Invalid choice so exiting.");
                                System.exit(0);
                        }
                    }
                    else System.out.println(element+" pushed.");
                    break;
                case 2:
                    char pop;
                    pop = ob.popChar();
                    System.out.println(pop+ " popped.");
                    break;
                default:
                    System.out.println("Invalid choice so exiting.");
                    System.exit(0);
            }
            ob.Display();
        }
    }
}
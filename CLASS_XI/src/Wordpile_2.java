/*
WordPile is an entity which can hold a maximum of 20 characters. The restriction is
that a character can be added or removed from one end only. Some of the members of
classes are given below:
Class name: WordPile
Data members/instance variables:
ch[]: character array to hold the character elements
capacity: integer variable to store the maximum capacity
top: to point to the index of the topmost element
Member functions/methods:
WordPile (int cap): constructor to initialise the data member capacity = cap, top = -1
and create the WordPile
void pushChar(char v): adds the character to the top of WordPile if possible, otherwise
output a message "WordPile is full”
char popChar(); returns the deleted character from the top of the WordPile if possible,
otherwise it returns ‘\\’
Specify the class WordPile giving the details of the constructor, void pushChar(char)
and char popChar()
 */
import java.util.*;
public class Wordpile_2
{
    char ch[];
    int capacity,top;
    Wordpile_2(int cap){
        capacity = cap;
        top = -1;
        ch = new char[capacity];
    }
    void pushChar(char v){
        if(top==(capacity-1))
            System.out.println("Wordpile is full.");
        else
        {
            top++;
            ch[top]=v;
            //System.out.println("ch[top]= "+ch[top]+" top= "+top);
        }
    }
    char popChar(){
        char c;
        if(top==-1){
            c='\\';
        }
        else{
            c=ch[top];
            top--;
        }
        return c;
    }
    void display(){
        if(top==-1)
            System.out.println("Wordpile is empty");
        else {
            for(int i=top;i>=0;i--){
                System.out.println(ch[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the capacity of stack");
        int max=sc.nextInt();
        if(max>20) {
            System.out.println("Invalid Capacity");
            System.exit(0);
        }
        Wordpile_2 obj=new Wordpile_2(max);
        int cho=0;
        char n;
        while(cho!=4)
        {
            System.out.println("\n\nEnter 1 to add a character to the wordpile.");
            System.out.println("Enter 2 to delete the last character entered from the wordpile.");
            System.out.println("Enter 3 to show characters in the wordpile");
            System.out.println("Enter 4 for exit.");
            System.out.println("Enter your choice:");
            cho=sc.nextInt();
            switch (cho)
            {
                case 1:
                    System.out.println("\nEnter a character to the wordpile:");
                    n=sc1.nextLine().charAt(0);
                    obj.pushChar(n);
                    break;
                case 2:
                    n=obj.popChar();
                    if(n=='\\')
                        System.out.println("Wordpile empty");
                    else
                        System.out.println("Element deleted is: "+n);
                    break;
                case 3:
                    System.out.println("Wordpile status");
                    obj.display();
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

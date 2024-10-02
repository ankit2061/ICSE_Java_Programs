import java. util. Scanner;
class Atreyee
{
    static char ch[];
    int capacity;
    static int top;
    void display(){
        for(int i=0;i<=top;i++){
            System.out.println("\t"+ch[i]+"\t");
        }
    }
    public Atreyee(int cap)
    {
        capacity=cap;
        top=-1;
        ch=new char[capacity];
    }
    public void pushChar(char v)
    {
        if(top+1==capacity)
            System.out.println("WordPile is full");
        else
            ch[++top]=v; }
    public char popChar()
    {
        if(top==-1) return '\\';
        else
            return ch[top--];
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the capacity of stack");
        int c=sc.nextInt();
        System.out.println();
        System.out.println("top = "+top);
        System.out.println("Five elements entered");
        Atreyee wp=new Atreyee(c);
        wp.pushChar('a');
        wp.pushChar('b');
        wp.pushChar('c');
        wp.pushChar('d');
        wp.pushChar('e');
        System.out.println("Stack Status:");
        for(int i=0;i<c;i++)
            System.out.print(ch[i]+"\t");
        System.out.println("top = "+top);
        System.out.println();
        System.out.println("Push Operation");
        System.out.println("--------------");
        System.out.println();
        System.out.println("Enter the element to insert:");
        char ele=sc.next().charAt(0);
        wp.pushChar(ele);
        System.out.println("Stack Status:");
        for(int i=0;i<c;i++)
            System.out.print(ch[i]+"\t");
        System.out.println("top = "+top);
        System.out.println();
        System.out.println("Pop Operation");
        System.out.println("--------------");
        System.out.println();
        System.out.println("Popped element: "+wp.popChar());
        System.out.println("Stack Status:");
        for(int i=0;i<c;i++)
            System.out.print(ch[i]+"\t");
        System.out.println("top = "+top);
    }
}

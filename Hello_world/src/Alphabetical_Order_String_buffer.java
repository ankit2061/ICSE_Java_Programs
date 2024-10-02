import java.util.Scanner;
public class Alphabetical_Order_String_buffer {
    String s;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word:");
        s=sc.next();
    }
    void operation(){
        char array[]=s.toCharArray(),temp;
        int n= array.length;
        int size = array.length;
        for (int i = 0 ;i< size-1; i++){
            int min = i;
            for (int j = i+1; j<size; j++){
                if (array[j] < array[min]){
                    min = j;
                }
            }
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        System.out.println("Arranged in alphabatical order:");
        for(int i=0;i<size;i++)
            System.out.print(array[i]);
        System.out.println();
        System.out.println("With characters between each letters after arranging in alphabatical order: ");
        for(char c=array[0];c<=array[size-1];c++)
            System.out.print(c);
    }
    public static void main(String[] args) {
        Alphabetical_Order_String_buffer ob=new Alphabetical_Order_String_buffer();
        ob.input();
        ob.operation();
    }
}

/*A superclass Number is defined to calculate the factorial of a number. Define a subclass Series
        to find the sum of the series S = 1! + 2! + 3! + 4! + ………. + n!.

        The details of the members of both classes are given below:
        Class name: Number
        Data member/instance variable:
        n: to store an integer number
        Member functions/methods:
        Number(): constructor to initialize the data member
        int factorial(int a): returns the factorial of a number
        (factorial of n = 1 × 2 × 3 × …… × n)
        void display() : display the member variable
        Class name: Series
        Data member/instance variable:
        sum: to store the sum of the series
        Member functions/methods:
        Series(…) : parameterized constructor to initialize the data members of both the classes
        void calSum(): calculates the sum of the given series
        void display(): displays the data members of both the classes
        Using the concept of inheritance, specify both the classes giving the details of the constructor (…),
        void caSum(), and void display(). Also define the main method.

 */
import java.util.Scanner;
public class Number {
    int n;
    Number(){
        n=0;
    }
    int factorial(int a){
        int f =1;
        for(int i=1;i<=a;i++){
            f *=i;
        }
        return f;
    }
    void display(){
        System.out.println("n= "+n);
    }
}
class Series extends Number{
    int sum;
    Series(int a,int b){
        n=a;
        sum=b;
    }
    void caSum(){
        for (int i=1;i<=n;i++){
            sum+=factorial(i);
        }
    }
    void display(){
        super.display();
        caSum();
        System.out.println("Sum= "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int nn=sc.nextInt();
        Series ob=new Series(nn,0);
        ob.display();
    }
}


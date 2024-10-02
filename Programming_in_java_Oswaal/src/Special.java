import java.util.*;
public class Special {
    int n;
    Special(){
        n=0;
    }
    void read(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
    }
    int factorial(int x){
        if(x==0)
            return 1;
        else
            return x*factorial(x-1);
    }
    Boolean isSpecial(){
        int s=0;
        for(int i=0;i<Integer.toString(n).length();i++)
         s+=factorial(Integer.parseInt(Character.toString(Integer.toString(n).charAt(i))));
        if(s==n)
            return true;
        else
            return false;
    }
    void display(){
        if(isSpecial()==true)
            System.out.println("Special number");
        else System.out.println("Not a special number");
    }

    public static void main(String[] args) {
        Special ob =new Special();
        ob.read();
        ob.display();
    }
}

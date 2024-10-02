import java.util.*;
public class Tech_number
{
    String n;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextLine();
    }
    void calc(){
        int l=n.length();
        if(l%2==0){
            String fh=n.substring(0,(l/2));
            String sh=n.substring(l/2,l);
            int s=Integer.parseInt(fh)+Integer.parseInt(sh);
            s=s*s;
            if(s==Integer.parseInt(n)){
                System.out.println(n+" is a tech number");
            }
            else System.out.println(n+" is not a tech number");
        }
        else
        System.out.println(n+" is not a tech number");
    }
    public static void main(String[] args) {
        Tech_number ob=new Tech_number();
        ob.input();
        ob.calc();
    }
}

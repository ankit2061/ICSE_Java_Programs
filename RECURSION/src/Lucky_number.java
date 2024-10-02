import java.util.*;
public class Lucky_number
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number limit of lucky number:");
        int n=sc.nextInt(),l=0;
        int a[]=new int[20];
        for(int i=0;i<20;i++){
            a[i]=l;
            ++l;
        }
        int c=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<18;j++){
                if(a[j]!=0){
                    a[j+c]=0;
                }
                c++;
            }
        }
        System.out.println("Lucky numbers:");
        for(int i=0;i<20;i++){
            System.out.println(a[i]);
        }
    }
}

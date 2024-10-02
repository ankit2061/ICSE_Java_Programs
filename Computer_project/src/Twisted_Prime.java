import java.io.*;
public class Twisted_Prime {
    public int Prime_check(int n){
        int c=0,i=0,f=0;
        for(i=2;i<=n/2;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==0)
           f=1;
        else
            f=0;
        return f;
    }
    public int Number_reverse(int n){
        int r=0,rn=0;
        while(n!=0){
            r=n%10;
            rn=n*10+r;
            n=n/10;
        }
        return rn;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number:");
        int n=Integer.parseInt(br.readLine());
        Twisted_Prime ob=new Twisted_Prime();
        int prime_checker=ob.Prime_check(n);
        if(prime_checker==1){
            int number_reverse=ob.Number_reverse(n);
            int reverse_number_prime_checker= ob.Prime_check(number_reverse);
            if(reverse_number_prime_checker==1)
                System.out.println(n+" is twisted prime");
            else
                System.out.println(n+" is not twisted prime");
        }
        else {
            System.out.println(n + " is not a prime number");
            System.out.println("PLEASE TRY AGAIN");
        }

    }
}

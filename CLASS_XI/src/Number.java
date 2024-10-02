import java.util.*;
class Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=0,d=0,n=0;
        System.out.println("Enter a number:");
        n=sc.nextInt();
        String w1[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String w2[]={"Eleven","Twelve","Thirteen","Fouteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String w3[]={"Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        if(n<10)
            System.out.println(w1[n]);
        else
        if(n>=10&&n<100)
        {
            d=n%10;
            n=n/10;
            if(d==0)
                System.out.println(w3[n-1]+" ");
            else if(n==1)
                System.out.println(w2[n-1]+" ");
            else
                System.out.println(w3[n-1]+" "+w1[d]);
        }
        else
        {
            d = n%100;
            n=n/100;
            if(d==0)
                System.out.println(w1[n]+" " + "hundred ");
            else
            if(d>0&&d<=9)
                System.out.println(w1[n] + " " + "hundred " + w1[d]);
            else
            if(d%10==0)
                System.out.println(w1[n] + " " + "hundred " +" "+ w3[d/10-1]);
            else
            if(d/10==1)
                System.out.println(w1[n] + " " + "hundred "+w2[d%10-1]);
            else
            {
                x = d%10;
                d=d/10;
                System.out.println(w1[n] + " " + "hundred " + w3[d-1] + " " + w1[x]);
            }
        }
    }
}
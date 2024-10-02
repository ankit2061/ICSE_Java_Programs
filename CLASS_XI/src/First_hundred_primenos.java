public class First_hundred_primenos {
    public static void main(String[] args) {
        int ct=0,n=0,i=1,j=1;
        System.out.println("First 100 prime numbers are:");
        while(n<100)
        {
            j=1;
            ct=0;
            while(j<=i)
            {
                if(i%j==0)
                    ct++;
                j++;
            }
            if(ct==2)
            {
                System.out.println(i);
                n++;
            }
            i++;
        }
    }
}

package Don_Bosco;

public class Q7 {
    public static void main(String[] args) {
        String s="RONALDO IS ONE OF THE GREATEST FOOTBALL PLAYERS OF ALL TIME",S2="";
        System.out.println("Original String:\n"+s);
        String s1=s.replace("RONALDO","MESSI");
        String s2=s1.replace("GREATEST","PROMINENT");
        System.out.println("Corrected String:\n"+s2);

    }
}
/*
OUTPUT:
Corrected String:
MESSI IS ONE OF THE PROMINENT FOOTBALL PLAYERS OF ALL TIME
 */
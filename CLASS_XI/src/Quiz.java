import java.util.*;
public class Quiz {
    int N,grade[];
    String a[][],key[];
    void input(){
        System.out.println("Enter the number of participants:");
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        if(!(N>3 && N<11)){
            System.out.println("Invalid input");
            System.exit(0);
        }
        a=new String[N][5];
        key=new String[5];
        grade=new int[N];
        Scanner sc1=new Scanner(System.in);
        for(int i=0;i<N;i++){
            System.out.println("For Participant No. "+(i+1));
            for(int j=0;j<5;j++){
                System.out.println("Q"+(j+1));
                a[i][j]=sc1.nextLine();
            }
        }
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter the key:");
        for(int i=0;i<5;i++){
            System.out.println("Q"+(i+1));
            key[i]=sc2.nextLine();
        }
    }
    void check(){
        int marks=0;
        System.out.println("Scores:");
        for(int i=0;i<N;i++){
            System.out.print("Participant No. "+(i+1));
            for(int j=0;j<5;j++){
                if(key[j].equalsIgnoreCase(a[i][j]))
                    marks++;
            }
            System.out.print(": "+marks);
            grade[i]=marks;
            System.out.println();
            marks=0;
        }
    }
    void highest_marks(){
        int max=0;
        for(int i=0;i<N-1;i++){
            if(grade[i]<grade[i+1])
                max=i+1;
        }
        System.out.println("Highest Score:");
        for(int i=0;i<N;i++){
            if(grade[i]==grade[max])
                System.out.println("Participant: "+(i+1));
        }
    }
    public static void main(String[] args) {
        Quiz ob=new Quiz();
        ob.input();
        ob.check();
        ob.highest_marks();
    }
}

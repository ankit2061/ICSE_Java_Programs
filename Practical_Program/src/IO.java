import java.util.*;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
public class IO
{
    public static void main(String[] args) {
        int clas,roll_no;
        String name,stream;
        Scanner sc=new Scanner(System.in);
        try{
            FileWriter fw=new FileWriter("Stud.txt");
            PrintWriter outFile=new PrintWriter(fw);
            for(int i=0;i<5;i++) {
                System.out.println("Enter name:");
                name = sc.nextLine();
                System.out.println("Enter class:");
                clas = sc.nextInt();
                /*System.out.println("Enter stream:");
                stream = sc.nextLine();*/
                System.out.println("Enter roll no:");
                roll_no = sc.nextInt();
                /*fw.write("Name: " + name);
                fw.write("Class: " + clas);
                fw.write("Roll No.: " + roll_no);
                */
                outFile.println("Name: "+name);
                outFile.println("Class: "+clas);
                outFile.println("Roll No.: "+roll_no);
                //outFile.println("Stream: "+stream);
            }
            //fw.close();
            outFile.close();
        }
        catch(IOException e){
            System.out.println("File not found"+e);
        }


    }
}

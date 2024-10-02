
import java.util.Scanner;
import java.io.*;
public class Filereading
{
     //static String f_name="Stud.txt";

    public static void main(String[] args)throws IOException {
        try(FileWriter fw = new FileWriter("stud.txt")) {

            Scanner sc = new Scanner("fw");
            PrintWriter pw = new PrintWriter("sc");
            System.out.println("Enter the name and roll number of 5 students:");
            for (int i = 0; i < 5; i++) {
                String name = sc.nextLine();
                int roll_no = sc.nextInt();
                pw.write(name + " " + roll_no);
            }
            fw.close();
            pw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}

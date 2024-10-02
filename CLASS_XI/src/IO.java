import java.io.*;
public class IO
{
    static String fileName=("names.txt");
    static InputStreamReader isr=new InputStreamReader(System.in);
    static BufferedReader br =new BufferedReader(isr);
    public static void main(String args[]){
        try{
            FileWriter fw=new FileWriter(fileName);
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter outFile=new PrintWriter(bw);
            for(int i=0;i<5;i++){
                System.out.println("Enter name:");
                String name= br.readLine();
                System.out.println("Enter class:");
                String class_n= br.readLine();
                System.out.println("Enter roll no:");
                String roll_no= br.readLine();
                System.out.println("Enter stream:");
                String stream= br.readLine();
                outFile.println("Name: "+name);
                outFile.println("Class: "+class_n);
                outFile.println("Roll No.: "+roll_no);
                outFile.println("Stream: "+stream);
            }
            outFile.close();
        }
        catch(IOException e){
            System.err.println(e);
        }
    }
}


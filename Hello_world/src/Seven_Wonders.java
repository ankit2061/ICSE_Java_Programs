import java.util.*;
public class Seven_Wonders {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the country:");
        String country_name=sc.nextLine();
        String wonders[]={"CHICKEN ITZA","CHRIST THE REEDEMER","TAJ MAHAL","GREAT WALL OF CHINA","MACHU PICCHU","PETRA","COLOSSEUM"};
        String country[]={"MEXICO","BRAZIL","INDIA","CHINA","PERU","JORDAN","ITALY"};
        boolean check=false;
        int i=0,f=0;
        for(i=0;i< country.length;i++){
            if(country[i].equalsIgnoreCase(country_name)){
                check=true;
                System.out.println(country[i]+":\t"+wonders[i]);
                break;
            }
            else
                f++;
        }
        if(f>=country.length)
            System.out.println("Sorry,not found!");
    }
}

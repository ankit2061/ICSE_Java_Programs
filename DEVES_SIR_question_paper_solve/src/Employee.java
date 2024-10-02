import java.util.*;
public class Employee {
    int emp_No=0;
    String name="";
    double basicSalary=0.0;
    public void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employee number");
        emp_No=sc.nextInt();
        System.out.println("Enter the employee name");
        name=sc.nextLine();
        System.out.println("Enter the basic salary of the employee");
        basicSalary= sc.nextDouble();
    }
    public void generateSlip(){
        double net_salary=0.0,gross_salary=0.0;
        if(basicSalary>=50000){
            gross_salary=basicSalary+0.53+0.12+0.10;
            net_salary=gross_salary-0.08;
        }
        if(basicSalary>=30000&&basicSalary<50000){
            gross_salary=basicSalary+0.45+0.10+0.12;
            net_salary=gross_salary-(7.5/100);
        }
        if(basicSalary>=10000&&basicSalary<30000){
            gross_salary=basicSalary+0.40+0.08+0.14;
            net_salary=gross_salary-0.07;
        }
        if(basicSalary<10000){
            gross_salary=basicSalary+0.35+0.07+0.18;
            net_salary=gross_salary-(6.75/100);
        }
        System.out.println("Emp_No /t/t "+" /t/t Name"+" /t/t Gross Salary"+" /t/t Net Salary");
        System.out.println(emp_No+" /t/t "+name+" /t/t "+gross_salary+" /t/t "+net_salary+" /t/t ");
    }
}

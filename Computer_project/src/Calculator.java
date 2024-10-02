import java.io.*;
public class Calculator {
    public void sum() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Two numbers:");
        double n11 = Double.parseDouble(br.readLine());
        double n12 = Double.parseDouble(br.readLine());
        double s = n11 + n12;
        System.out.println(n11 + " + " + n12 + " = " + s);
    }

    public void difference() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Two numbers:");
        double n21 = Double.parseDouble(br.readLine());
        double n22 = Double.parseDouble(br.readLine());
        double d = n21 - n22;
        System.out.println(n21 + " - " + n22 + " = " + d);
    }

    public void product() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Two numbers:");
        double n31 = Double.parseDouble(br.readLine());
        double n32 = Double.parseDouble(br.readLine());
        double p = n31 * n32;
        System.out.println(n31 + " X " + n32 + " = " + p);
    }

    public void division() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Two numbers:");
        double n41 = Double.parseDouble(br.readLine());
        double n42 = Double.parseDouble(br.readLine());
        double q = n41 / n42;
        double r = n41 % n42;
        System.out.println(n41 + " / " + n42 + " = " + q);
        System.out.println(n41 + " % " + n42 + " = " + r);
    }

    public void maximum() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Two numbers:");
        double n51 = Double.parseDouble(br.readLine());
        double n52 = Double.parseDouble(br.readLine());
        double max = Math.max(n51, n52);
        System.out.println("The maximum value of " + n51 + " and " + n52 + " is " + max);
    }

    public void minimum() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Two numbers:");
        double n61 = Double.parseDouble(br.readLine());
        double n62 = Double.parseDouble(br.readLine());
        double min = Math.min(n61, n62);
        System.out.println("The minimum value of " + n61 + " and " + n62 + " is " + min);
    }

    public void power() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number and its power you want to assign:");
        double n71 = Double.parseDouble(br.readLine());
        double n72 = Double.parseDouble(br.readLine());
        double power = Math.pow(n71, n72);
        System.out.println(n71 + " to the power " + n72 + " = " + power);
    }

    public void square_root() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        double n81 = Double.parseDouble(br.readLine());
        double sq = Math.sqrt(n81);
        System.out.println("Square root of " + n81 + " is " + sq);
    }

    public void cube_root() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        double n91 = Double.parseDouble(br.readLine());
        double cb = Math.cbrt(n91);
        System.out.println("Cube root of " + n91 + " is " + cb);
    }

    public void absolute_value() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        double n101 = Double.parseDouble(br.readLine());
        double absolute_val = Math.abs(n101);
        System.out.println("Absolute value of " + n101 + " is " + absolute_val);
    }

    public void ceiling_value() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        double n111 = Double.parseDouble(br.readLine());
        double ceil_value = Math.ceil(n111);
        System.out.println("Ceiling value of " + n111 + " is " + ceil_value);
    }

    public void floor_value() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        double n121 = Double.parseDouble(br.readLine());
        double floor_value = Math.floor(n121);
        System.out.println("Floor value of " + n121 + " is " + floor_value);
    }

    public void exponential_value() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        double n131 = Double.parseDouble(br.readLine());
        double exponent_val = Math.exp(n131);
        System.out.println("Exponential value of " + n131 + " is " + exponent_val);
    }

    public void Trigo_sine() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int n141 = Integer.parseInt(br.readLine());
        double rad1 = ((3.14 * n141) / 180);
        double ans1 = Math.sin(rad1);
        System.out.println("sin " + n141 + " = " + ans1);
    }

    public void Trigo_cosine() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int n151 = Integer.parseInt(br.readLine());
        double rad2 = ((3.14 * n151) / 180);
        double ans2 = Math.cos(rad2);
        System.out.println("cos " + n151 + " = " + ans2);
    }
    public void Trigo_tangent() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int n161 = Integer.parseInt(br.readLine());
        double rad3 = ((3.14 * n161) / 180);
        double ans3 = Math.tan(rad3);
        System.out.println("tan " + n161 + " = " + ans3);
    }
    public void random_nos(){
        double n171;
        System.out.println("Random number between 0 and 1 :");
        n171=Math.random();
        System.out.println(n171);
    }
    public void rounding_off() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        double n181 = Double.parseDouble(br.readLine());
        double rounded=Math.round(n181);
        System.out.println("Rounded no.: "+rounded);
    }
    public void nearest_int() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        double n191 = Double.parseDouble(br.readLine());
        double nearest_int=Math.rint(n191);
        System.out.println("Rounded no.: "+nearest_int);
    }
    public void Trigo_cotangent() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int n201 = Integer.parseInt(br.readLine());
        double rad4 = ((3.14 * n201) / 180);
        double ans4 = 1/(Math.tan(rad4));
        System.out.println("cot " + n201 + " = " + ans4);
    }
    public void Trigo_cosecant()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int n211 = Integer.parseInt(br.readLine());
        double rad5 = ((3.14 * n211) / 180);
        double ans5 = 1/(Math.sin(rad5));
        System.out.println("cosec " + n211 + " = " + ans5);
    }
    public void Trigo_secant()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int n221 = Integer.parseInt(br.readLine());
        double rad6 = ((3.14 * n221) / 180);
        double ans6 = 1/(Math.cos(rad6));
        System.out.println("sec " + n221 + " = " + ans6);
    }
}

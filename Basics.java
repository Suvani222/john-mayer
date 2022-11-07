import java.util.Scanner;

public class Basics {
    public static void main(String[]args){

        int radius;
        double area;
        double pi=3.14;

        Scanner s = new Scanner(System.in);
        System.out.println("enter the radius of a circle");
        radius = s.nextInt();
        area =  (pi *  radius* radius);
        System.out.println("the radius of a circle is  "+area);
        


    }
    
}

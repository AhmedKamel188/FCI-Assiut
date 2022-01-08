package praticalBook.sheet2.Q11;
import java.util.Scanner;
public class Main {
    public static void main(String... args) {
        // prompts user to enter the point
        System.out.print("Enter point (x, y) : ");
        String str = new Scanner(System.in).nextLine();
        // split string into substrings anf covert into double
        String[] str2 = str.split(",");
        double[] point = {Double.parseDouble(str2[0]), Double.parseDouble(str2[1])};
        // invoke method and print value
        point = getCartesian(point);
        System.out.println("Cartesian coordinates : (" + point[0] + ", " + point[1] + ")");
    }

    public static double getSin(double angle){
        return (4 * angle * (180 - angle))/(40500 - angle * (180 - angle));
    }

    public static double getCos(double angle){
        double hypotenuse = 1 / getSin(angle);
        double adjacent = Math.sqrt(hypotenuse * hypotenuse - 1);
        return adjacent / hypotenuse;
    }

    public static double[] getCartesian(double[] o){
        double[] n = new double[2];
        n[0] = Math.sqrt(Math.pow(o[0], 2) + Math.pow(o[1], 2));
        n[1] = 1 / (getSin(o[1]/o[0]) / getCos(o[1]/o[0]));
        return n;
    }
}
/*
Write a program which uses your own sin and cos functions to convert
from polar to Cartesian coordinates.
*/
package praticalBook.sheet2.Q12;
import java.util.Scanner;
public class Main {
    public static void main(String... args) {
        // prompts user to enter the number
        System.out.print("Enter number : ");
        double b = new Scanner(System.in).nextDouble();
        // prompts user to enter the power
        System.out.print("Enter power : ");
        double p = new Scanner(System.in).nextDouble();
        // print the result
        System.out.println(b + " ^ " + p + " = " + getPower(b, p));
    }

    public static double getPower(double base, double power){
        double result = 1;
        for(int i = 0; i < power; i++)
            result *= base;
        return result;
    }
}
/*
Write a function that takes two integers x and y then it computes x power y
*/
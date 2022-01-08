package praticalBook.sheet2.Q14;
import java.util.Scanner;
public class Main {
    public static void main(String... args) {
        // prompts user to enter the length
        System.out.print("Enter length : ");
        int len = new Scanner(System.in).nextInt();
        // print square of length
        square(len);
    }

    public static void square(int n) {
        for (int line = 0; line < n; line++) {
            for (int start = 0; start < n; start++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
/*
Write a function that takes an integer L as a parameter and print a square
of ‘*’ with length L. for example if L= 4, your function should output the
following shape.
* * * *
* * * *
* * * *
* * * *
*/
package praticalBook.sheet2.Q13;
public class Main {
    public static void main(String... args) {
        // print shape A with size of 5
        System.out.println("Shape A : ");
        shapeA(5);
        // print shape B with size of 5
        System.out.println("\nShape B : ");
        shapeB(5);
        // print shape C with size of 7
        System.out.println("\nShape C : ");
        shapeC(7);
    }

    public static void shapeA(int n){
        for(int line = 0; line < n; line++){
            for(int start = 0; start <= line; start++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void shapeB(int n){
        for(int line = 0; line < n*2; line+=2){
            if(line < n){
                for(int space = 0; space < (n-line)/2; space++)
                    System.out.print(" ");
                for(int start = 0; start <= line; start++)
                    System.out.print("*");
            } else {
                for(int space = 0; space <= (line-n)/2; space++)
                    System.out.print(" ");
                for(int start = 1; start < 2*n-line; start++)
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void shapeC(int n){
        for(int line = n; line >= 1; line-=2){
            for(int space = 0; space < (n-line)/2; space++)
                System.out.print(" ");
            for(int num = 0; num < line; num++)
                System.out.print((line+num)%2);
            System.out.println();
        }
    }
}
/*
Print the following patterns using loop :
a.
*
**
***
****
b.
*
***
*****
***
*
c.
1010101
10101
101
1
*/
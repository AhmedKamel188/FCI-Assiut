package praticalBook.sheet3.Q19;
import static praticalBook.sheet3.Q17.Main.sc;
public class Main {
    public static void main(String...args){
        // prompts user to enter number of items
        System.out.print("Enter number of different ordered items : ");
        int size = sc.nextInt();
        int[][] arr = new int[2][size];
        // prompts user to enter code and count for each item
        int ctr = 0;
        for(int i = 0; i < size; i++){
            System.out.print("Enter code for item " + (i+1) + " : ");
            arr[0][i] = sc.nextInt();
            System.out.print("Enter count for " + (arr[0][i]) + " : ");
            arr[1][i] = sc.nextInt();
            ctr += arr[1][i];
        }
        // print count for all items
        System.out.println("Total counts : " + ctr);
    }
}
/*
Write a program to count number of ordered items. The ordered items are stored in 2-dimension array.
The first column stores the item id and the second column stores the number of ordered items.
*/
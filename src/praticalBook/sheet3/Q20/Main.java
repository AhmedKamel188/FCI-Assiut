package praticalBook.sheet3.Q20;
import static praticalBook.sheet3.Q17.Main.sc;
import static praticalBook.sheet3.Q16.Main.sortArray;
import static praticalBook.sheet3.Q16.Main.getArray;
public class Main {
    public static void main(String...args){
        // prompts user to enter size of array
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        // invoke getArray method to receive values from user
        int[] arr = getArray(size);
        // invoke sortArray method to sort array
        sortArray(arr);
        // print array after sorting
        printArray(arr);
        // prompts user to enter number to add
        System.out.print("\nEnter number : ");
        int number = sc.nextInt();
        // invoke addElement to add number into array
        arr = addElement(arr, number);
        // print array after adding
        System.out.print("Array after adding : ");
        printArray(arr);
    }

    public static void printArray(int[] arr){
        for(int i : arr)
            System.out.print(i + " ");
    }

    public static int[] addElement(int[] arr, int num){
        int[] new_arr = new int[arr.length+1];
        if(num <= arr[0]){
            new_arr[0] = num;
            for(int i = 0; i < arr.length; i++)
                new_arr[i+1] = arr[i];
        } else if(num >= arr[arr.length-1]){
            new_arr[arr.length] = num;
            for(int i = 0; i < arr.length; i++)
                new_arr[i] = arr[i];
        } else{
            new_arr[0] = arr[0];
            new_arr[new_arr.length-1] = arr[arr.length-1];
            boolean flag = false;
            for(int i = 1; i < new_arr.length-1; i++){
                if(arr[i-1] <= num && num <= arr[i]){
                    new_arr[i] = num;
                    flag = true;
                } else {
                    if(flag) new_arr[i] = arr[i-1];
                    else new_arr[i] = arr[i];
                }
            }
        }
        return new_arr;
    }
}
/*
Write a function that takes two parameters, a sorted array of integers and an integer x.
the function should return the array after inserting the integer x in the right position.
*/
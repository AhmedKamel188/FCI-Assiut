package praticalBook.sheet3.Q16;
import java.util.Scanner;
public class Main {
    public static void main(String...args){
        // prompts user to enter array size
        System.out.print("Enter size of array : ");
        int size = new Scanner(System.in).nextInt();
        // receive values from user
        int[] nums = getArray(size);
        // invoke method and print output
        sortArray(nums);
        for(int i : nums)
            System.out.print(i + " ");
    }

    public static void sortArray(int[] arr){
        for(int i = 0; i < arr.length; i++)
            for(int j = 0; j < arr.length; j++)
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
    }

    public static int[] getArray(int size){
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter element number " + (i+1) + " : ");
            nums[i] = new Scanner(System.in).nextInt();
        }
        return nums;
    }
}
/*
Write a function that takes an integer array as input and returns the same array after sorting it.
*/
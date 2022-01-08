package praticalBook.sheet3.Q18;
import static praticalBook.sheet3.Q16.Main.sortArray;
import static praticalBook.sheet3.Q16.Main.getArray;
import static praticalBook.sheet3.Q17.Main.sc;
public class Main {
    public static void main(String...args){
        // prompts user to enter array size
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        // invoke getArray method
        int[] nums = getArray(size);
        // invoke sortArray method
        sortArray(nums);
        // print sorted array
        System.out.print("Sorted: ");
        for(int i : nums)
            System.out.print(i + " ");
        // prompts user to enter number which search for
        System.out.print("\nEnter number : ");
        int num = sc.nextInt();
        // invoke binarySearch method
        System.out.println("Result : " + binarySearch(nums, num, 0, nums.length));
    }

    public static int binarySearch(int[] arr, int num, int b, int e){
        if(b<=e) {
            int index = b + (e - b) / 2;
            if(arr[index]==num) return index;
            else if(arr[index] > num) {
                return binarySearch(arr, num, b, e-1);
            } else {
                return binarySearch(arr, num, b+1, e);
            }
        } return -1;
    }
}
/*
Write a program that uses the function in problem 2 to sort an array of integers before searching this array using binary search algorithm.
\The program should ask the user to enter the length of the array and the array elements (dynamic array).
The user also enters an element and the program prints the index of this element or -1 if the element doesn’t exist in the array.
*/
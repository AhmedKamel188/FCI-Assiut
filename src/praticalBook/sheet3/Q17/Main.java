package praticalBook.sheet3.Q17;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static ArrayList<String> students = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String...args){
        boolean flag = true;
        while(flag){
            System.out.print("1.Add\n2.Delete\n3.Show\n4.End\nAnswer : ");
            int opt = sc.nextInt();
            switch(opt){
                case 1: addStudent(); break;
                case 2: delStudent(); break;
                case 3: show(); break;
                case 4: flag = false; break;
                default: System.out.println("Invalid input");
            }
        }
    }

    public static void addStudent(){
        System.out.print("Enter student name : ");
        String name = sc.next();
        students.add(name);
    }
    public static void delStudent(){
        System.out.print("Enter student name : ");
        String name = sc.next();
        students.remove(name);
    }

    public static void show(){
        for(int i = 0; i < students.size(); i++)
            System.out.println("Student " + (i+1) + " : " + students.get(i));
    }
}
/*
Write a program to show how to use dynamic array (ArrayList) of String.
The program should accept to enter students’ names and managing an ordered list of student names.
The program should allow adding, deleting and showing students list.
*/
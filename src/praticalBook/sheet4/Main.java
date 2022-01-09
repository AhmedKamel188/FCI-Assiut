package praticalBook.sheet4;
import static praticalBook.sheet3.Q17.Main.sc;
import java.util.Random;
import java.util.ArrayList;
public class Main {
    public static Random rd = new Random();
    private static ArrayList<Student>storeStudents = new ArrayList<>();

    public static void main(String[] args){
        // prompts user to enter number of students
        System.out.print("Enter number of students : ");
        int number = sc.nextInt();
        // prompts user to choose students details
        System.out.println("Do you want to enter student's details or not ?");
        System.out.print("1.Manually\n2.Randomly\nAnswer : ");
        int ans = sc.nextInt();
        // invoke method to add students
        for(int i = 0; i < number; i++)
            switch(ans){
                case 1: newStudent(); break;
                case 2: randomStudent(); break;
            }
        // invoke method to print student with the highest score
        printHighest();
    }

    public static void randomStudent(){
        Student s = new Student();
        s.setAge(rd.nextDouble(18, 26));
        s.setID(rd.nextInt(9000, 10000));
        s.setLevel(rd.nextInt(1, 5));
        s.setScore(rd.nextDouble(4));
        storeStudents.add(s);
    }

    public static void newStudent(){
        Student s = new Student();
        System.out.print("Enter student name : ");
        s.setName(sc.next());
        System.out.print("Enter student age : ");
        s.setAge(sc.nextDouble());
        System.out.print("Enter student ID : ");
        s.setID(sc.nextInt());
        System.out.print("Enter student level : ");
        s.setLevel(sc.nextInt());
        System.out.print("Enter student score : ");
        s.setScore(sc.nextDouble());
        storeStudents.add(s);
    }

    public static void printHighest(){
        Student highest = storeStudents.get(0);
        for(int i = 1; i < storeStudents.size(); i++)
            if(storeStudents.get(i).getScore() > highest.getScore())
                highest = storeStudents.get(i);
        highest.printStudent();
    }
}
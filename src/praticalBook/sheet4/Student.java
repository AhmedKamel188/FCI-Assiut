package praticalBook.sheet4;
public class Student {
    // Attributes
    private String name;
    private double age;
    private int id;
    private int level;
    private double score;

    // Constructors
    public Student(){
        this.name = "Test";
        this.age = 20;
        this.id = 0;
        this.level = 2;
        this.score = 3;
    }

    public Student(String n, double a, int i, int l, double s){
        this.name = n;
        this.age = a;
        this.id = i;
        this.level = l;
        this.score = s;
    }

    public Student(double a, int i, int l, double s){
        this.name = "Unknown";
        this.age = a;
        this.id = i;
        this.level = l;
        this.score = s;
    }

    // Mutators (Setters)
    public void setName(String n){
        this.name = n;
    }

    public void setAge(double a){
        this.age = a;
    }

    public void setID(int i){
        this.id = i;
    }

    public void setLevel(int l){
        this.level = l;
    }

    public void setScore(double s){
        this.score = s;
    }

    // Accessors (Getters)
    public String getName(){
        return this.name;
    }

    public double getAge(){
        return this.age;
    }

    public int getID(){
        return this.id;
    }

    public int getLevel(){
        return this.level;
    }

    public double getScore(){
        return this.score;
    }

    // Other Methods
    public String toString(){
        return  "Name : " + this.name +
                "\nAge : " + this.age +
                "\nID : " + this.id +
                "\nLevel : " + this.level +
                "\nScore : " + this.score;
    }

    public void printStudent(){
        System.out.println(this.toString());
    }
}
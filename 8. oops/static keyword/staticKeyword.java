class Student {
    private int rollno;
    private String name;
    static String college = "ITS";

    Student(int r, String n) {
        rollno = r;
        name = n;
    } 

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

public class staticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student(111, "Bhanu");
        Student s2 = new Student(222, "Rana");
        
        s1.display();
        s2.display();

        Student.college = "MIT";
        s1.display();
        s2.display();

        s1.college = "chitkara";
        s1.display();
        s2.display();
    }
}
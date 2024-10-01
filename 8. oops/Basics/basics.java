package Basics;
/*
 - CLASS 
 * is a blueprint for an object
 * its a logical construct
 * class name is also called a non-primitive data type
 
 - OBJECT 
 * instance of a class
 * physical reality , occupies space in memory
 * Classified in 3 categories 
 1. state of object -> its value from class
 2. identity of object -> how a object is different from another object
 3. Behaviour of object 
 
 - INSTANCE -> a physical stuff of that class
 
 - . -> operator used with object name to fetch instance variable from class. In java . operator is called separator 
 * INSTANCE VARIABLE -> variable declared inside a class
 
 - NEW 
 * keyword used to allocate memory dynamically i.e during runtime
 * Student student1 = new Student()
 * student1 variable of Student class will be stored in stack , and it will refer to object created which will present in heap with its properties/attributes

 - CONSTRUCTORS 
 * defines what has to be done when a object will be created, when a object instantiates first of all constructor is called
 * DEFAULT CONSTRUCTOR - when a object is created , and no parameter is passed , in that case default constructor will be called and that will initialise all the attributes of that class with default values
 
 - this 
 * keyword that refers to current object and used to initialise the attributes of current object in class

 - final
 * keyword that makes a value constant and can't be modified in case of primitive variables but in case of non-primitive value can be changed but it can't be re-assigned
 * It should be initialsed while declaring
 
 - static 
 * properties that are not directly related to an object , but are common to all the objects of that class are declared as static
 
- INHERITENCE

 - GETTERS AND SETTERS
 * if a attribute is declared as a private attribute in that case it can neither be changed nor accessed , so for that getters and setters are used

 */

class Student {
    int rno;
    String name;
    float marks;

    void print() {
        System.out.println("my name is " + name);
    }

    void changeName(String name) {
        this.name = name;
    }

    Student(String name) {
        // calling another constructor from this constructor
        // this(10, "default person", 10.0f);
        this.name = name;
    }

    Student(int rno, String name, float marks) {
        System.out.println("constructor called ");
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other) {
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }
}

public class basics {
    public static void main(String[] args) {
        
        // Student student1 = new Student(11, "Bhanu Partap Singh Rana", 9.18f);
        // Student student2 = new Student(12, "Partap", 9.48f);

        // student1.print();
        // System.out.println(student1.rno);
        // System.out.println(student1.name);
        // System.out.println(student1.marks);

        // System.out.println();
        
        // System.out.println(student2.rno);
        // System.out.println(student2.name);
        // System.out.println(student2.marks);   

        // student1.changeName("Rana");
        // System.out.println(student1.name);


        // PASSING OBJECT 

        // Student random = new Student(student1);
        // Student random = new Student();
        // System.out.println(random.name);
        // System.out.println(random.rno);
        // System.out.println(random.marks);

        final int num = 10;
        System.out.println(num);

        final Student student1 = new Student("Bhanu");
        student1.name = "Rana";
        System.out.println(student1.name);
    }
}
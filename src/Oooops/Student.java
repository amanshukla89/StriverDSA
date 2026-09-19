package Oooops;

public class Student {
    //Attributes
    public int id;
    public  int age;
    public String name;
    public  int nos;

    //Default ctor // attr--> garbage
//    public Student() {
//        System.out.println("Student default ctor called");
//    }

    // Parameterized ctor
    public Student(int id,int age,String name,int nos) {
        System.out.println("Parameterized ctor is called");
       this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    // Copy ctor
    public Student(Student srcob) {
        System.out.println("Copy ctor is called");
        this.id = srcob.id;
        this.age = srcob.age;
        this.name = srcob.name;
        this.nos = srcob.nos;
    }

    //Methods //Behaviour
    void study() {
        System.out.println(name +  " Studying");
    }

    void sleep() {
        System.out.println( name + "is sleeping");
    }

    void bunk () {
        System.out.println(name + "is Bunking the class ");
    }
}

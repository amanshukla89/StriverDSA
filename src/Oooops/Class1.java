package Oooops;

public class Class1 {
    void main() {
    //Default ctor
        //Student A = new Student();

//        A.id = 1;
//        A.age = 15;
//        A.name = "Aman";
//        A.nos = 5;
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//        A.bunk();
//        A.sleep();
//        A.study();

        //Parameterized way
        Student A = new Student(1,21,"Aman",2);
//            System.out.println(A.name);
//            System.out.println(A.age);
//            System.out.println(A.id);
//            System.out.println(A.nos);
//
//            A.study();
//            A.sleep();
//            A.bunk();

//            Copy ctor
//            Student b = new Student(A);
//            System.out.println(b.name);
//            System.out.println(b.age);
//            System.out.println(b.id);
//            System.out.println(b.nos);

//            b.bunk();
//            b.sleep();
//            b.study();

        Student c = new Student(2,12,"megha",3);
        Student d = new Student(3,45,"neha",32);
        Student e= new Student(4,19,"kuha",34);
        }

}

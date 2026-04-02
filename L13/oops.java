import java.util.*;

public class oops {
    public static void main(String args[]) {
        // Pen p1=new Pen();
        // p1.setColor("Blue");
        // System.out.println(p1.getColor());
        // p1.setTip(5);
        // System.out.println(p1.getTip());

        //?Constructor:-
        // Student s1=new Student();
        // Student s2=new Student("subh");
        // Student s3=new Student(123);
        Student s1=new Student();
        s1.name="subh";
        s1.roll=12;
        s1.password="s123";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=90;

        Student s2=new Student(s1);
        s2.password="xyz";
        s1.marks[2]=100;

        for(int i=0; i < 3;i++) {
            System.out.println(s2.marks[i]);
        }



    }
}

// class Pen {
//     private String color;
//     private int tip;

//     String getColor() {
//         return this.color;
//     }
//     int getTip() {
//         return this.tip;
//     }

//     void setColor(String newColor) {
//         color=newColor;
//     }
//     void setTip(int newTip) {
//         tip=newTip;
//     }
// }

//*Constructor:-


class Student {
    String name;
    int roll;
    String password;
    int marks[];

    //TODO (i)Non-parameterized constuctor:-
    Student() {
        marks=new int[3];
        System.out.println("Contructor is called ..");
    }
    //TODO (ii)Parameterized constructor:-
    Student(String name) {
        marks=new int[3];
        this.name=name;
    }
    //TODO (iii) Shallow Copy Constructor:-
    // Student(Student s1) {
    //     marks=new int[3];
    //     this.name=name;
    //     this.roll=roll;
    //     this.marks=marks;
    // }
    //TODO (iv) Deep Copy Constructor:-
        Student(Student s1) {
        marks=new int[3];
        this.name=name;
        this.roll=roll;
        for(int i=0; i < marks.length;i++) {
            this.marks[i]=s1.marks[i];
        }
    }
}
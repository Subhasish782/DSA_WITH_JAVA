public class pracoops {
    public static void main(String args[]) {
       //*Q.1
    //    Student s1=new Student();
    //    s1.name="subh";
    //    System.out.println(s1.name);

       //*Q.2 
    //    Vehicle v=new Car();//?correct
    //    Car c=new Vehicle();//?Wrong(showing run time error)
    //*Q.3
    // Vehicle obj1=new Car();
    // obj1.print();//it is the concept of method overriding

    // Vehicle obj2=new Vehicle();
    // obj2.print();
    //*Q.4
    // Vehicle obj1=new Car();
    // obj1.print1(); //?Compilation error

    // Vehicle obj2=new Vehicle();
    // obj2.print();
    //*Q.5
    // System.out.println(Book.count);
    // Book b1=new Book(150);
    // Book b2=new Book(250);
    // System.out.println(Book.count);
    //*Q.6
    Test t=new Test();
    t.changeB();
    System.out.println(Test.a+Test.b);



    }
}

//*Q.1
class Student {
    String name;
    int marks;
}
//*Q.2
// class Vehicle()
// class Car extends Vehicle()
//*Q.3
// class Vehicle {
//     void print() {
//         System.out.println("Base class(Vehicle)");
//     }
// }
// class Car extends Vehicle {
//     void print() {
//         System.out.println("Derived class(Car)");
//     }
// }
//*Q.4
// class Vehicle {
//     void print() {
//         System.out.println("Base class(Vehicle)");
//     }
// }
// class Car extends Vehicle {
//     void print1() {
//         System.out.println("Derived class(Car)");
//     }
// }
//* Q.5
// class Book {
//     int price;
//     static int count;

//     public Book(int price) {
//         this.price=price;
//         count++;
//     }
// }
//*Q.6
class Test {
    static int a=10;
    static int b;
    static void changeB() {
        b = a * 3;
    }
}



/*
1.Java - What is OOP?
OOP stands for Object-Oriented Programming.
Procedural programming is about writing procedures or methods that perform operations on the data, 
while object-oriented programming is about creating objects that contain both data and methods.

2.Object-oriented programming has several advantages over procedural programming:

OOP is faster and easier to execute
OOP provides a clear structure for the programs
OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
OOP makes it possible to create full reusable applications with less code and shorter development time

3.Classes and objects are the two main aspects of object-oriented programming.
4.a class is a template for objects, and an object is an instance of a class.
5.When the individual objects are created, they inherit all the variables and methods from the class.
6.Everything in Java is associated with classes and objects, along with its attributes and methods. 
For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.

A Class is like an object constructor, or a "blueprint" for creating objects.
7.In Java, an object is created from a class. We have already created the class named Main, so now we can use this to create objects.

To create an object of Main, specify the class name, followed by the object name, and use the keyword new:

8.You can also create an object of a class and access it in another class. This is often used for better organization of 
classes (one class has all the attributes and methods, while the other class holds the main() method (code to be executed)).
 */

public class Day6OOP {

    int x = 7;

    public static void main(String[] args) {
        System.out.println("hello");
        //System.out.println(x);  //err

        Day6OOP myObj = new Day6OOP();
        System.out.println(myObj.x);

        Day6OOP myObj2 = new Day6OOP();
        System.out.println(myObj2.x);
    }

}

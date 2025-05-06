/*
1.Java Inheritance (Subclass and Superclass)
In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:

subclass (child) - the class that inherits from another class
superclass (parent) - the class being inherited from
To inherit from a class, use the extends keyword.
 */
package inheritance;

public class Inheritance extends Person {

    public static void main(String[] args) {
        
        Person myObj = new Person();

        System.out.println("hi");
        System.out.println("hello");
        System.out.println(myObj.gender);
    }

}

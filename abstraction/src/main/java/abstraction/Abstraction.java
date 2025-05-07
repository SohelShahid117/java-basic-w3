/*
1.Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces 

2.The abstract keyword is a non-access modifier, used for classes and methods:
Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
An abstract class can have both abstract and regular methods

3.Why And When To Use Abstract Classes and Methods?
To achieve security - hide certain details and only show the important details of an object.

4.in abstraction,user shows only functionality not implemantation,as like ATM taka withdraw
 */
package abstraction;

public class Abstraction {
//abstract class Abstraction {

    int a = 11;

    static class A {

        int x = 5;

        String myMethod() {
            return "hello world";
        }
    }

    public static void main(String[] args) {

        System.out.println("hello");
        //System.out.println(a);
        Abstraction myObj = new Abstraction();
        System.out.println(myObj.a);

        Abstraction.A myObj2 = new Abstraction.A();

        System.out.println(myObj2.x);
        System.out.println(myObj2.myMethod());

        Pig myPig = new Pig();
        myPig.animalSound();
//        System.out.print(myPig.animalSound());
        myPig.sleep();

    }

}

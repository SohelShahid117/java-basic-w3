/*
1.Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces 

2.The abstract keyword is a non-access modifier, used for classes and methods:
Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
An abstract class can have both abstract and regular methods
 */
package abstraction;

public class Abstraction {

    int a = 11;

    static class A {

        int x = 5;
        String myMethod(){
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
    }

}

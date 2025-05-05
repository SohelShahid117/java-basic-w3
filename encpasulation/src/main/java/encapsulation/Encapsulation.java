/*
1.The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

declare class variables/attributes as private
provide public get and set methods to access and update the value of a private variable

2.private variables can only be accessed within the same class (an outside class has no access to it).
However, it is possible to access them if we provide public get and set methods.
3.The get method returns the variable value, and the set method sets the value.
4.Why Encapsulation?
Better control of class attributes and methods
Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
Flexible: the programmer can change one part of the code without affecting other parts
Increased security of data
 */
package encapsulation;

public class Encapsulation {

    public static void main(String[] args) {
        System.out.println("Hello");
        Person myObj = new Person();
        myObj.setName("Shahid");
        myObj.setAge(18);
        System.out.println(myObj.getName());
        System.out.println(myObj.getAge());
    }

}

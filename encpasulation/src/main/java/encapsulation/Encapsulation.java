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

5.Java Packages & API
A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name 
conflicts, and to write a better maintainable code. Packages are divided into two categories:

Built-in Packages (packages from the Java API)
User-defined Packages (create your own packages)

6.The library is divided into packages and classes. Meaning you can either import a single class (along with its methods and attributes), 
or a whole package that contain all the classes that belong to the specified package.

To use a class or a package from the library, you need to use the import keyword:

7.import package.name.Class;   // Import a single class
import package.name.*;   // Import the whole package

8.To import a whole package, end the sentence with an asterisk sign (*). 
9.
 */
package encapsulation;
//import java.util.Scanner;
import java.util.*;

public class Encapsulation {

    public static void main(String[] args) {
        System.out.println("Hello");
        Person myObj = new Person();
        
        myObj.setName("Shahid");
        myObj.setAge(18);
        System.out.println(myObj.getName());
        System.out.println(myObj.getAge());
        
        Scanner myObj2 = new Scanner(System.in);
        //String fullName;
        System.out.println("enter your name:");
        String fullName = myObj2.nextLine();
        System.out.println("your name is:"+fullName);
        
        
        
        
    }

}

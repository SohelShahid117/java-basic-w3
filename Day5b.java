/*
1.A method is a block of code which only runs when it is called.
You can pass data, known as parameters, into a method.
Methods are used to perform certain actions, and they are also known as functions.
Why use methods? To reuse code: define the code once, and use it many times.

2.
public class Main {
  static void myMethod() {
    // code to be executed
  }
}
myMethod() is the name of the method
static means that the method belongs to the Main class and not an object of the Main class. 
void means that this method does not have a return value

3.Parameters and Arguments
Information can be passed to methods as a parameter. Parameters act as variables inside the method.

Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want,
just separate them with a comma.

4.When a parameter is passed to the method, it is called an argument. 
  So, from the example above: fname is a parameter, while Liam, Jenny and Anja are arguments.
  Note that when you are working with multiple parameters, the method call must have the 
  same number of arguments as there are parameters, and the arguments must be passed in the same order.

5.Return Values
In the previous page, we used the void keyword in all examples, which indicates that the method should not return a value.
If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void, 
and use the return keyword inside the method:
 */
public class Day5b {

    static void myMethod() {
        System.out.println("I just got executed!");
    }

    static void myMethod2(String fname) {
        System.out.println(fname + " Refsnes");
    }

    static void myMethod3(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    // Create a checkAge() method with an integer parameter called age
    static void checkAge(int age) {

        // If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

            // If age is greater than, or equal to, 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    static int myMethod4(int x) {
        return 5 + x;
    }

    static int myMethod5(int x,int y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println("hi");
        myMethod();
        myMethod();

        myMethod2("Sohel");
        myMethod2("Aadil");

        myMethod3("Sumi", 33);
        myMethod3("Rumi", 34);

        checkAge(78);

        System.out.println(myMethod4(8));
        int z = myMethod5(7, 8);
        System.out.println(z);
    }

}

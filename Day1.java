/*
1.https://www.w3schools.com/java/
2.how to run the code------->C:\Users\Your Name>javac Main.java then C:\Users\Your Name>java Main
3.Every line of code that runs in Java must be inside a class. And the class name should always start with an uppercase first letter.
4.Text must be wrapped inside double quotations marks ""
5.single line comment //
6./*multi line comment*/
 /*
7.In Java, there are different types of variables, for example:

String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false
 */
 /*
8.To create a variable, you must specify the type and assign it a value:type variableName = value;
9.
 */
public class Day1 {

    public static void main(String[] args) {

        System.out.println("hello world");
        System.out.print("Hello World!\n");
        System.out.print("I will print on the same line.\n");
        System.out.println(3);
        System.out.println(358);
        System.out.println(3 + 63);

        int myNum;
        myNum = 15;
        System.out.println(myNum);

        String name = "John";
        System.out.println(name);

        myNum = 20;  // myNum is now 20
        System.out.println(myNum);

        /*
        If you don't want others (or yourself) to overwrite existing values, use the final keyword 
        (this will declare the variable as "final" or "constant", which means unchangeable and read-only):
         */
        final int myNum2 = 1444445;
        //myNum2 = 20; // will generate an error
        System.out.println(myNum2);

        int myNum3 = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        String name2 = "John";
        System.out.println("Hello " + name2);

        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        int x = 5;
        int y = 6;
        System.out.println(x + y); // Print the value of x + y

        int x1 = 5, y1 = 6, z1 = 50;
        System.out.println(x1 + y1 + z1);

        int x2, y2, z2;
        x2 = y2 = z2 = 50;
        System.out.println(x2 + y2 + z2);
    }

    //Java Identifiers
    /*
    All Java variables must be identified with unique names.
    These unique names are called identifiers.
     */
    
    // Good
    int minutesPerHour = 60;

    // OK, but not so easy to understand what m actually is
    int m = 60;
    
    System.out.println(minutesPerHour);
    System.out.println(m);
}

/*
1.Data types are divided into two groups:

a.Primitive data types - includes byte, short, int, long, float, double, boolean and char
b.Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)

2.
byte	Stores whole numbers from -128 to 127
short	Stores whole numbers from -32,768 to 32,767
int	Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
boolean	Stores true or false values
char	Stores a single character/letter or ASCII values

3.
Primitive number types are divided into two groups:

Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals. Valid types are-
byte, short, int and long. Which type you should use, depends on the numeric value.

Floating point types represents numbers with a fractional part, containing one or more decimals. There are two types: float and double.
4.Even though there are many numeric types in Java, the most used for numbers are int (for whole numbers) and 
double (for floating point numbers). However, we will describe them all as you continue to read.

5.
Use float or double?

The precision of a floating point value indicates how many digits the value can have after the decimal point. 
The precision of float is only six or seven decimal digits, while double variables have a precision of about 16 digits. 
Therefore it is safer to use double for most calculations.


6.
Non-Primitive Data Types
Non-primitive data types are called reference types because they refer to objects.

The main differences between primitive and non-primitive data types are:

Primitive types in Java are predefined and built into the language, while non-primitive types are created by the programmer (except for String).
Non-primitive types can be used to call methods to perform certain operations, whereas primitive types cannot.
Primitive types start with a lowercase letter (like int), while non-primitive types typically starts with an uppercase letter (like String).
Primitive types always hold a value, whereas non-primitive types can be null.
 */

public class Day2 {

    public static void main(String[] args) {
        int myNum = 5;               // integer (whole number)
        float myFloatNum = 5.99f;    // floating point number
        char myLetter = 'D';         // character
        boolean myBool = true;       // boolean
        String myText = "Hello";     // String    
        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);

        byte myNum2 = 100;
        System.out.println(myNum2);

        long myNum3 = 15000000000000066L;
        System.out.println(myNum3);

        float myNum4 = 5.75f;
        System.out.println(myNum4);

        double myNum5 = 19.99d;
        System.out.println(myNum5);

        float f1 = 35e3f;
        double d1 = 12E44d;
        System.out.println(f1);
        System.out.println(d1);

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        char myGrade = 'B';
        //char myGrade = "B";  //error
        System.out.println(myGrade);

        //ASCII values
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        String greeting = "Hello World";
        System.out.println(greeting);

        // Create variables of different data types
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        // Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);

    }
}

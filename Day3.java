/*
1.Java Type Casting
Type casting is when you assign a value of one primitive data type to another type.

Primitive data types - includes byte, short, int, long, float, double, boolean and char
Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)
Prim
In Java, there are two types of casting:

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte

2.widening casting is done automatically when passing a smaller size type to a larger size type:



 */
public class Day3 {

    public static void main(String[] arg) {
        System.out.println("hi");

        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);
        System.out.println(myDouble);

        float x = 9.333f;
        int y = (int) x; // Explicit casting: float to int

        System.out.println(x);
        System.out.println(y);

        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Explicit casting: double to int

        System.out.println(myDouble2);
        System.out.println("hello "+myInt2);
        
         // Set the maximum possible score in the game to 500
    int maxScore = 500;

    // The actual score of the user
    int userScore = 423;

    /* Calculate the percantage of the user's score in relation to the maximum available score.
    Convert userScore to float to make sure that the division is accurate */
    float percentage = (float) userScore / maxScore * 100.0f;

    // Print the result
    System.out.println("User's percentage is " + percentage);

    }
}

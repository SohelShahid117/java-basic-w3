/*
1.Java divides the operators into the following groups:

Arithmetic operators
Assignment operators
Comparison operators
Logical operators
Bitwise operators

2.Java Strings
Strings are used for storing text.

A String variable contains a collection of characters surrounded by double quotes

 */

public class Day4 {

    public static void main(String[] args) {
        System.out.println("hello world");

        int x = 100 + 50;
        System.out.println(x);

        int sum1 = 100 + 50;
        int sum2 = sum1 + 250;
        int sum3 = sum2 + sum1;
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

        //Arithmetic Operators
        int x1 = 5;
        int y1 = 3;
        System.out.println(x1 + y1);
        System.out.println(x1 - y1);
        System.out.println(x1 * y1);
        System.out.println(x1 / y1);
        System.out.println(x1 % y1);
        System.out.println(x1++);
        System.out.println(x1);
        System.out.println(++y1);

        int x2 = 9;
        x2++;
        System.out.println(x2);
        int y2 = 7;
        y2--;
        System.out.println(y2);
        System.out.println(--y2);

        //Java Assignment Operators
        int a = 5;
        System.out.println(a);
        int a1 = 5;
        a1 += 3;
        System.out.println(a1);

        int x3 = 5;
        x3 -= 3;
        System.out.println(x3);

        int x4 = 5;
        x4 -= 3;
        System.out.println(x4);

        int x5 = 5;
        x5 *= 3;
        System.out.println(x5);

        int x6 = 5;
        x6 /= 3;
        System.out.println(x6);

        int x7 = 5;
        x7 %= 3;
        System.out.println(x7);

        int x8 = 5;
        x8 &= 3;
        System.out.println(x8);

        /*
    Let's look at the binary values:

    5 in binary: 0101

    3 in binary: 0011

Bitwise AND (&):

    0101
  & 0011
    ------
    0001
Result is 1.
         */
        int x9 = 5;
        x9 |= 3;
        System.out.println(x9);

        /*
        Bitwise OR:
    0101  (5)
  | 0011  (3)
  ------------
  = 0111  (7)
         */
        int a2 = 5;
        a2 ^= 3;
        System.out.println(a2);

        /*
        the code uses the bitwise XOR assignment operator (^=). Here's how it works:
           0101   (5)
        ^  0011   (3)
        ---------------
        =  0110   (6)
         */
        int a3 = 5;
        a3 >>= 3;
        System.out.println(a3);
        /*
here using the right shift assignment operator >>=, which shifts the bits of x to the right by 3 positions.

Step-by-step breakdown:
The initial value of x is 5.

In binary, 5 is: 0000 0101.

Performing x >>= 3 shifts the bits 3 positions to the right:

0000 0101 → 0000 0000
                   ↑↑↑ (the 3 rightmost bits are removed)
Result: 0000 0000 0000 0000 0000 0000 0000 0000 (after right shift)
         */

        int a4 = 5;
        a4 <<= 3;
        System.out.println(a4);

        /*
    x = 5 → binary: 0000 0101

    x <<= 3 means shift the bits of x left by 3 positions:

    0000 0101 becomes 0010 1000 → which is 40 in decimal.
    40 in binary = 101000
         */
        //Java Comparison Operators
        int b = 5;
        int c = 3;
        System.out.println(b == c); // returns false because 5 is not equal to 3
        System.out.println(b != c);
        System.out.println(b > c);
        System.out.println(b < c);
        System.out.println(b >= c);
        System.out.println(b <= c);

        //Java Logical Operators
        /*
        Java Logical Operators
        You can also test for true or false values with logical operators.
        Logical operators are used to determine the logic between variables or values:

Operator	Name        Description                                                     Example	
    &&      Logical and         Returns true if both statements are true                x < 5 &&  x < 10	
    ||      Logical or          Returns true if one of the statements is true           x < 5 || x < 4	
    !       Logical not         Reverse the result, returns false if the result is true	!(x < 5 && x < 10)	

         */
        int d = 5;
        System.out.println(d > 3 && d < 10); // returns true because 5 is greater than 3 AND 5 is less than 10
        System.out.println(d > 6 || d < 10);

        System.out.println(!(d > 3 && d < 10));

        String greeting = "Hello";
        System.out.println(greeting);

        /*
    A String in Java is actually an object, which contain methods that can perform certain operations on strings. For example,
    the length of a string can be found with the length() method:
         */
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());
        System.out.println(txt2.toLowerCase());

        /*
    Finding a Character in a String
    The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace)
    Java counts positions from zero.
    0 is the first position in a string, 1 is the second, 2 is the third ...
         */
        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt3.indexOf("locate"));

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));

        /*
    Adding Numbers and Strings
    WARNING!

    Java uses the + operator for both addition and concatenation.
    Numbers are added. Strings are concatenated.
         */
        int q = 10;
        int y = 20;
        int z = q + y;
        System.out.println(z);

        String q2 = "10";
        String w2 = "20";
        String z2 = q2 + w2;
        System.out.println(z2);

        String q3 = "10";
        int w3 = 20;
        String z3 = q3 + w3;
        System.out.println(z3);
        
        String txt4 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt4);
        
        String txt5 = "It\'s alright.";
    System.out.println(txt5);
    
      String txt6 = "The character \\ is called backslash.";
    System.out.println(txt6);
    
    String txt7 = "Hello\nWorld!";
    System.out.println(txt7);
    
      String txt8 = "Hello\rWor\rld!";
    System.out.println(txt8);
    
    String txt9 = "Hello\tWorld!";
    System.out.println(txt9);
    
    //Java Math
    System.out.println(Math.max(5, 10));
    System.out.println(Math.min(5, 10));
    System.out.println(Math.sqrt(10));
    
    //The Math.abs(x) method returns the absolute (positive) value of x:
    System.out.println(Math.abs(-4.7));  
    System.out.println(Math.random()); 
    
    /*
    To get more control over the random number, for example, if you only want a random number
    between 0 and 100, you can use the following formula:
    */
    
     int randomNum = (int)(Math.random() * 101);  // 0 to 100
    System.out.println(randomNum);

    }

}

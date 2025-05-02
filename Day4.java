/*
Java divides the operators into the following groups:

Arithmetic operators
Assignment operators
Comparison operators
Logical operators
Bitwise operators
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
    
    
    }

}

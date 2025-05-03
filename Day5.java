/*
1.Loops
Loops can execute a block of code as long as a specified condition is reached.
Loops are handy because they save time, reduce errors, and they make code more readable.

2.The Do/While Loop
The do/while loop is a variant of the while loop. This loop will execute the code block once,
before checking if the condition is true, then it will repeat the loop as long as the condition is true.
 */
public class Day5 {

    public static void main(String[] args) {
        System.out.println("hello");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
            //Note: Do not forget to increase the variable used in the condition, otherwise the loop will never end!
        }

        System.out.println("enjoy do-while loop");
        int j = 0;
        do {
            System.out.println(i);
            j++;
        } while (j < 5);
        //Do not forget to increase the variable used in the condition, otherwise the loop will never end!

        int countdown = 3;

        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        System.out.println("Happy New Year!!");

        int dice = 1;

        while (dice <= 6) {
            if (dice < 6) {
                System.out.println(dice + ".No Yatzy.");
            } else {
                System.out.println(dice + ".Yatzy!");
            }
            //dice = dice + 1;
            dice++;
        }

        /*
Java For Loop
When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop
         */
        for (int k = 0; k < 5; k++) {
            System.out.println(k);
        }

        for (int i1 = 0; i1 <= 10; i1 = i1 + 2) {
            System.out.println(i1);
        }

        /*
         Nested Loops
It is also possible to place a loop inside another loop. This is called a nested loop.
         */
        // Outer loop.
        for (int a = 1; a <= 2; a++) {
            System.out.println("Outer: " + a); // Executes 2 times

            // Inner loop
            for (int b = 1; b <= 3; b++) {
                System.out.println(" Inner: " + b); // Executes 6 times (2 * 3)
            }
        }

        /*
        For-Each Loop
There is also a "for-each" loop, which is used exclusively to loop through elements in an array (or other data sets):
        for (type variableName : arrayName) {
  // code block to be executed
}
         */
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String a : cars) {
            System.out.println(a);
        }

        String[] fruits = {"apple", "banana", "mango"};
        for (String f : fruits) {
            System.out.println(f);
        }

        for (int a = 0; a <= 100; a += 10) {
            System.out.println(a);
        }
        
            for (int a = 0; a <= 10; a = a + 2) {
      System.out.println(a);
    }
            
               int number = 2;

    // Print the multiplication table for the number 2
    for (int k = 1; k <= 10; k++) {
      System.out.println(number + " x " + k + " = " + (number * k));
    }

    }
}

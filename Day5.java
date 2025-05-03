
import java.util.Arrays;

/*
1.Loops
Loops can execute a block of code as long as a specified condition is reached.
Loops are handy because they save time, reduce errors, and they make code more readable.

2.The Do/While Loop
The do/while loop is a variant of the while loop. This loop will execute the code block once,
before checking if the condition is true, then it will repeat the loop as long as the condition is true.

3.Java Break
You have already seen the break statement used in an earlier chapter of this tutorial. It was used to "jump out" of a switch statement.
The break statement can also be used to jump out of a loop.

4.Java Continue
The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

5.Multidimensional Arrays
A multidimensional array is an array of arrays.
Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.
To create a two-dimensional array, add each array within its own set of curly braces:

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

        for (int k = 0; k < 10; k++) {
            if (k == 4) {
                break;
            }
            System.out.println(k);
        }

        for (int k = 0; k < 10; k++) {
            if (k == 4) {
                continue;
            }
            System.out.println(k);
        }

        System.out.println("apply \"brreak\" using while loop:");
        int k = 0;
        while (k < 10) {
            System.out.println(k);
            k++;
            if (k == 4) {
                break;
            }
        }

        int m = 0;
        while (m < 10) {
            if (m == 4) {
                //m++;
                m++;
                continue;
            }
            System.out.println(m);
            m++;
        }

        /*
        Java Arrays:
        Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
        To declare an array, define the variable type with square brackets:
        String[] cars;
         */
        String[] carss = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(carss[0]);
        System.out.println(carss.length);

        String[] carsss = {"Volvo", "BMW", "Ford", "Mazda"};
        carsss[0] = "Opel";
        carsss[2] = "Premio";
        System.out.println(Arrays.toString(carsss));

        for (String c : carsss) {
            System.out.println(c);
        }
        System.out.println(carsss.length);

        for (int d = 0; d < carsss.length; d++) {
            System.out.println(cars[d]);
        }

        // An array storing different ages
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg, sum = 0;

        // Get the length of the array
        int length = ages.length;

        // Loop through the elements of the array
        for (int age : ages) {
            sum += age;
        }

        // Calculate the average by dividing the sum by the length
        avg = sum / length;

        // Print the average
        System.out.println("The average age is: " + avg);

        int lowestAge = ages[0];

        // Loop through the elements of the ages array to find the lowest age
        for (int age : ages) {
            // Check if the current age is smaller than the current 'lowest age'
            if (age < lowestAge) {
                // If the smaller age is found, update 'lowest age' with that element
                lowestAge = age;
            }
        }

        // Output the value of the lowest age
        System.out.println("The lowest age in the array is: " + lowestAge);

        int highestAge = ages[0];

        // Loop through the elements of the ages array to find the lowest age
        for (int age : ages) {
            // Check if the current age is smaller than the current 'lowest age'
            if (age > highestAge) {
                // If the smaller age is found, update 'lowest age' with that element
                highestAge = age;
            }
        }

        // Output the value of the lowest age
        System.out.println("The lowest age in the array is: " + highestAge);

        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        System.out.println(myNumbers[1][1]);

        myNumbers[1][1] = 9;
        System.out.println(myNumbers[1][1]); // Outputs 9 instead of 7

        System.out.println("apply for-each loop in 2D array");
        for (int[] q : myNumbers) {
            for (int r : q) {
                System.out.println(r);
            }
        }
        
        System.out.println("apply forloop in 2D array");

        for (int l = 0; l < myNumbers.length; l++) {
            for (int n = 0; n < myNumbers[l].length; n++) {
                System.out.println(myNumbers[l][n]);
            }
        }

    }
}

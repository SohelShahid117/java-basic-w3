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

    }

}

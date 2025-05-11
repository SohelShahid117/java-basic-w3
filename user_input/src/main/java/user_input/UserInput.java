/*
1.The Scanner class is used to get user input, and it is found in the java.util package.
To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation
2.we will use the nextLine() method, which is used to read Strings:
3.
 */
package user_input;
import java.util.Scanner;

public class UserInput {

    public static void main(String[] a) {

        System.out.println("hello");
        System.out.println("Enter your name");
        
        Scanner myObj = new Scanner(System.in);
        
        String userName = myObj.nextLine();
//        System.out.println("Enter your name:"+myObj.nextLine());
        System.out.println("your name is:"+userName);
        
        System.out.println("Enter name:");
        String uName = myObj.nextLine();
        
        System.out.println("Enter age:");
        int uAge = myObj.nextInt();
        
        System.out.println("Enter Salary:");
        double uSalary = myObj.nextDouble();
        
        System.out.println("Name:"+uName);
        System.out.println("Age:"+uAge);
        System.out.println("Salary:"+uSalary);
    }
}

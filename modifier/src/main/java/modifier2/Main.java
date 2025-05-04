/*
1.A static method means that it can be accessed without creating an object of the class, unlike public
2.

 */
package modifier2;

public class Main {

    private String fname = "John";
    private String lname = "Doe";
    private String email = "john@doe.com";
    private int age = 24;

    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
        
         myStaticMethod(); // Call the static method
         myObj.myPublicMethod();
    }
}


class Second {

    //attributes
    int x = 6;
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    //methods 
    static void myMethod() {
        System.out.println("Hello World!");
    }

    /*
    we created a static method, which means that it can be accessed without creating an object of the class,
    unlike public, which can only be accessed by objects:
     */
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    // Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args) {
        Main myObj = new Main();

        System.out.println(myObj.a);
        myObj.a = 40; //Modify Attributes
        System.out.println(myObj.a);
        System.out.println(myObj.b);
        //myObj.b = 78;
        //System.out.println(myObj.b); //err,b is final
        //System.out.println(myObj.x); //err

        Second myObj2 = new Second();
        System.out.println(myObj2.x);

        System.out.println("Name: " + myObj2.fname + " " + myObj2.lname);
        System.out.println("Age: " + myObj2.age);
        myObj2.myMethod();
        myMethod();

        myStaticMethod();
        //myPublicMethod(); // error: non-static method myPublicMethod() cannot be referenced from a static context
        myObj2.myPublicMethod();

        Second myCar = new Second();
        myCar.fullThrottle();
        myCar.speed(40);
        
          Main myCar2 = new Main();
          myCar2.sound("pop pop");

    }
}

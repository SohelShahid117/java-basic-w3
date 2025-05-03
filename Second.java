
class Second {

    int x = 6;

    String fname = "John";
    String lname = "Doe";
    int age = 24;

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

    }
}

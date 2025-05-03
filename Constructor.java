/*
1.Note that the constructor name must match the class name, and it cannot have a return type (like void).
Also note that the constructor is called when the object is created.
All classes have constructors by default: if you do not create a class constructor yourself,
Java creates one for you. However, then you are not able to set initial values for object attributes.

2.Constructors can also take parameters, which is used to initialize attributes.
3.
 */
public class Constructor {

    int x;

    int modelYear;
    String modelName;

    public Constructor(int b, int year, String name) {
        x = 5;
        System.out.println("hello");
        System.out.println(x);
        int a = b;
        System.out.println(a);

        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Constructor myObj = new Constructor(88,1969, "Mustang");
        System.out.println(myObj.x);
        
        System.out.println(myObj.modelYear + " " + myObj.modelName);

    }

}

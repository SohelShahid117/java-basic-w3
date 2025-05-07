/*
1.Java Inner Classes
In Java, it is also possible to nest classes (a class within a class). The purpose of nested classes is to group classes that belong together,
which makes your code more readable and maintainable.
To access the inner class, create an object of the outer class, and then create an object of the inner class

2.Unlike a "regular" class, an inner class can be private or protected. If you don't want outside objects to access the inner class, 
declare the class as private

3.An inner class can also be static, which means that you can access it without creating an object of the outer class
4.Note: just like static attributes and methods, a static inner class does not have access to members of the outer class.
5.

*/

package innerClass;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");

        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
//        OuterClass.InnerClass myInner = myOuter.new InnerClass();
//        System.out.println(myOuter.x + myInner.y);
        System.out.println(myOuter.x + myInner.y);
        System.out.println(myInner.innerMethod());

    }
}

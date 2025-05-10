/*
1.multiple inheritance is impossible in class
2.multiple inheritance is possible in interface
3.interface e method er body takena,method name take only & sei method er body takbe sub class e .so multiple inheritance is possible
in interface.
4.interface er object hoina,class er object ready kora jabe.
5.interface doesn't contain constructor.
6.all the methods in interface are abstract.
7.interface can have only abstract method but in class can have abstract method,non abstract method
8.interface support multiple inheritance,class support only 1 inheritance,
9.in interface can only have static & final variable,in class can have all types of variable
10.interface are fully(100%) abstract where class have partial(0 to 100%) abstract

11.By allowing a class to implement multiple interfaces, you gain flexibility. A class can take on various roles or capabilities
 */
package interface_demo;

public class Test {

    public static void main(String[] args) {
        //Dog D;

        Dog d1 = new Dog();
        d1.eat();

        C myObj = new C();
        myObj.play();

        MultifunctionPrinter M = new MultifunctionPrinter();
        M.hello();
        M.print();
        M.scan();

    }

}

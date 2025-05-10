/*
1.multiple inheritance is impossible in class
2.multiple inheritance is possible in interface
3.interface e method er body takena,method name take only & sei method er body takbe sub class e .so multiple inheritance is possible
in interface.
 */
package interface_demo;

public class Test {

    public static void main(String[] args) {
        //Dog D;

        Dog d1 = new Dog();
        d1.eat();

        C myObj = new C();
        myObj.play();

    }

}

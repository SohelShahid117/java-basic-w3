/*
1.The public keyword is an access modifier, meaning that it is used to set the access level for classes, attributes, methods and constructors.
2.
Access Modifiers - controls the access level
Non-Access Modifiers - do not control access level, but provides other functionality

3.For classes, you can use either public or default
4.For attributes, methods and constructors, you can use public(all class),private(same class),
protected(same package and subclasses),default(same package.)
*/
package modifier1;

public class Test {

    public static void main(String[] args) {
        A myObj = new A();
        myObj.display();
    }

}

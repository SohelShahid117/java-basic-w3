
package encapsulation;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return "my name is " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return "my age is :"+ age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}

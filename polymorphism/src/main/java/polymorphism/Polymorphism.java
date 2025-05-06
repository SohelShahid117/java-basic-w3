/*
1.Java Polymorphism
Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
2.
*/
package polymorphism;

public class Polymorphism {

    public static void main(String[] args) {
        System.out.println("hello");

        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }

}

abstract class Animal {
    abstract void sound(); // Abstract method

    void eat() { // Non-abstract method
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("The dog barks.");
    }
}

public class TestAbstractClass {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.eat();
    }
}

class Parent {
    void display() {
        System.out.println("Display from Parent class.");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Display from Child class.");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child(); // Parent reference, Child object
        obj.display(); // Runtime polymorphism
    }
}

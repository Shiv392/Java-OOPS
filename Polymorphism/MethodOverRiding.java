class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

public class MethodOverRiding {

    static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Dog barks");
        }
    }

    static class Cat extends Animal {
        @Override
        public void sound() {
            System.out.println("Cat meows");
        }
    }

    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.sound();
        animal2.sound();

        // Reference is Animal, actual object is Dog or Cat.
        // The overridden method is chosen at runtime.
    }
}

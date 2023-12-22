package InstanceOfExample;

class Animal {
    // Common properties and methods for all animals
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    // Properties and methods specific to a Dog
    void bark() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    // Properties and methods specific to a Cat
    void meow() {
        System.out.println("Meow! Meow!");
    }
}

public class InstanceOfExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Using instanceof to check the type of an object
        if (myDog instanceof Dog) {
            System.out.println("Dog is an instance of Dog");
            ((Dog) myDog).bark(); // Casting to access Dog-specific method
        }

        if (myCat instanceof Cat) {
            System.out.println("Cat is an instance of Cat");
            ((Cat) myCat).meow(); // Casting to access Cat-specific method
        }

        // Checking inheritance using instanceof
        if (myDog instanceof Animal) {
            System.out.println("Dog is an instance of Animal");
        }

        if (myCat instanceof Animal) {
            System.out.println("Cat is an instance of Animal");
        }

        // Using instanceof with null reference
        Animal nullAnimal = null;
        if (nullAnimal instanceof Animal) {
            System.out.println("nullAnimal is an instance of Animal");
        } else {
            System.out.println("nullAnimal is not an instance of Animal");
        }
    }
}


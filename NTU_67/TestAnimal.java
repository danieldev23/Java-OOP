package NTU_67;

public class TestAnimal {
    public static void main(String[] args) {
        // Using subclasses
        Cat cat1 = new Cat();
        cat1.greeting(); // Meow!

        Dog dog1 = new Dog();
        dog1.greeting(); // Woof!

        BigDog bigDog1 = new BigDog();
        bigDog1.greeting(); // Woow!

        // Using polymorphism
        Animal animal1 = new Cat();
        animal1.greeting(); // Meow!

        Animal animal2 = new Dog();
        animal2.greeting(); // Woof!

        Animal animal3 = new BigDog();
        animal3.greeting(); // Woow!

        // Downcast
        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3; // ClassCastException

        Cat cat2 = (Cat)animal2; // ClassCastException

        dog2.greeting(dog3); // Woooooooooof!
        dog3.greeting(dog2); // Woooooooooof!

        dog2.greeting(bigDog2); // Woooooooooof!
        bigDog2.greeting(dog2); // Woooooowwwww!

        bigDog2.greeting(bigDog1); // Woooooowwwww!
    }
}
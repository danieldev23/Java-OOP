package Chapter6_VKU.Chapter6_VKU_OOP_HuynhCongPhap.Ex1;

public class Ex2 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.eat();
        myDog.makeSound();

        myCat.eat();
        myCat.makeSound();
    }
}

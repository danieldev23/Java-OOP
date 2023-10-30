package Chapter6_VKU.Chapter6_VKU_OOP_HuynhCongPhap.Ex1;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog is barking.");
    }
}

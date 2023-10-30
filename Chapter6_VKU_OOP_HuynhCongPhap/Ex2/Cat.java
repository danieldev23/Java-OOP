package Chapter6_VKU.Chapter6_VKU_OOP_HuynhCongPhap.Ex1;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat is meowing.");
    }
}


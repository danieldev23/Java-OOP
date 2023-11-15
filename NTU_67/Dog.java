package NTU_67;

public class Dog extends Animal {
    @Override
    public void geeting() {
        System.out.println("Woof!");

    }

    @Override
    public void greeting() {
    }

    public void greeting(Dog another) {
        System.out.println("Woooooooooof!");
    }

}
import java.util.Random;

public class Chapter2_ex3 {
    public static void main(String[] args) {
        Random random = new Random();

        int randNum = random.nextInt(100);
        System.out.println(randNum);

        double randDouble = random.nextDouble();
    }
}

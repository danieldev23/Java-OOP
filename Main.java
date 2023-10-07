import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(Character.isLetter('a'));
        System.out.println(Character.isDigit('5'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('b'));
        System.out.println(Character.toUpperCase('m'));
        System.out.println(Character.toLowerCase('M'));
        System.out.println(Character.toString('x'));
        System.out.println(Character.getNumericValue('7'));
        System.out.println(Character.compare('a', 'b'));
    }
}
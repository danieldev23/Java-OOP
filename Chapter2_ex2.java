import java.io.*;

public class Chapter2_ex2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" Huy ITer </>");

        System.out.println(sb);

        sb.insert(0, "Say: ");
        System.out.println(sb);
    }
}

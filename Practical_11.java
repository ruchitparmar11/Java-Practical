import java.util.Random;

public class Practical_11 {
    public static void main(String[] args) {
        Random ra = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.print(" ");
            System.out.print(ra.nextInt(49));
        }
    }
}
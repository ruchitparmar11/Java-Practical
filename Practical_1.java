import java.util.*;

public class Practical_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Values of A B C D E F");
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();
        float D = sc.nextFloat();
        float E = sc.nextFloat();
        float F = sc.nextFloat();

        float x = (((E * D) - (B * F)) / ((A * D) - (B * C))) / E;
        float y = (((A * F) - (E * C)) / ((A * D) - (B * C))) / F;

        System.out.println("X =" + x);
        System.out.println("Y =" + y);
    }
}

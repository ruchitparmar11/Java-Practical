import java.util.Scanner;

public class Practical_03 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter value in meters: ");
            double meter = sc.nextFloat();
            double feet = meter * 3.28084;

            System.out.println("Meters = " + meter);
            System.out.println("Feet   = " + feet);
        }
    }
}
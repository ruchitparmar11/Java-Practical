import java.util.Scanner;

public class Practical_02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your weight in pound: ");
            float pound = sc.nextFloat();

            System.out.print("Enter your hight in inch: ");
            float inch = sc.nextFloat();

            System.out.print("BMI: ");
            double BMI = (pound * 0.45359237) / ((inch * 0.0254) * (inch * 0.0254));
            System.out.println(BMI);
        }
    }
}
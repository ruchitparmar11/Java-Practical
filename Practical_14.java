import java.util.Scanner;

public class Practical_14 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an Integer : ");
            int a = sc.nextInt();
            int div = 2;
            System.out.print("1");
            while (a > 1) {
                if (a % div == 0) {
                    System.out.print(", " + div);
                    a = a / div;
                }
                else {
                    div++;
                }
            }
        }
        System.out.println(".");
    }
}
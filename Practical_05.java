import java.util.Scanner;

public class Practical_05 {
    static void max_no(int a, int b, int c) {

        if (a > b) {
            if (a > c) {
                System.out.println(a + " is maximum number");
            } else {
                System.out.println(c + " is maximum number");
            }
        } else if (a < b) {
            if (b > c) {
                System.out.println(b + " is maximum number");
            } else {
                System.out.println(c + " is maximum number");
            }
        } else {
            System.out.println("All are same");
        }

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Three numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            max_no(a, b, c);
        }
    }
}
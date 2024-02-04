import java.util.Scanner;

public class Practical_15 {
    public static void gcd(int a, int b, int j) {
        byte flag = 0;
        int i;
        if (a < b)
            i = a;
        else
            i = b;
        for (j = i; i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first Integers : ");
            int a = sc.nextInt();
            System.out.print("Enter second Integers : ");
            int b = sc.nextInt();
            int i = 0;
            gcd(a, b, i);
        }
    }
}
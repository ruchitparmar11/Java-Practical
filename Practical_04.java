import java.util.Scanner;

public class Practical_04 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            int flag = 0;

            if (num == 0 || num == 1) {
                System.out.println(num + " is not a prime number: ");
            } else {
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        System.out.println(num + " is Not prime");
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println(num + " is prime");
                }
            }
        }
    }

}
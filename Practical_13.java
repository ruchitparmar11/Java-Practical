import java.util.Scanner;

public class Practical_13 {

    public static int gcd(int num1, int num2) {
        int min;
        if (num1 > num2) {
            min = num2;
        } else {
            min = num1;
        }
        for (int i = min; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static String convertToFraction(double decimalNum) {
        int a = 1000000;
        int numerator = (int) (decimalNum * a);
        int denominator = a;

        int GCD = gcd(numerator, denominator);

        numerator = numerator / GCD;
        denominator = denominator / GCD;

        String fraction = numerator + "/" + denominator;
        return fraction;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal number : ");
        double decimalNum = sc.nextDouble();
        String fraction = convertToFraction(decimalNum);
        System.out.println("The given Decimal number " + decimalNum + " convert into Fraction number : " + fraction);
        sc.close();
    }
}
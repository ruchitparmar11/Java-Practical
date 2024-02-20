import java.util.Scanner;

public class Practical_23 {
    Double Area;
    Practical_23(double radius) {
        Area = (3.14 * radius * radius);
    }

    Practical_23(int radius) {
        Area = (3.14 * radius * radius);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of the circle : ");
        double r1 = sc.nextDouble();
        Practical_23 p1 = new Practical_23(r1);
        Practical_23 p2 = new Practical_23(r1);
        System.out.println("Area of the double radius of the circle : " + p1.Area);
        System.out.println("Area of the integer radius of the circle is : " + p2.Area);
        sc.close();
    }
}
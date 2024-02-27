import java.util.Scanner;

public class Practical_07 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a String : ");
            String str = sc.nextLine();
            int length = str.length();
            System.out.println("The size of the String is: " + length);
            System.out.print("First-Half of the String is: ");
            System.out.println(str.substring(0, length / 2));
            System.out.print("Second-Half of the String is: ");
            System.out.println(str.substring(length / 2, length));
        }
    }
}
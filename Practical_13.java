import java.util.Scanner;

public class Practical_13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Decimal Number as String : ");
            String s = sc.nextLine();
            int index = s.indexOf('.');
            String s1 = s.substring(0,index);
            String s2 = s.substring(index+1);
            System.out.println("Integer Part is : " + s1);
            System.out.println("Fraction Part is : " + s2);
        }
    }
}
import java.util.Scanner;

public class Practical_06 {
    static void checkVowel(int x) {
        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
            System.out.println("Vowel");
        } else if (x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Character : ");
            char x = sc.next().charAt(0);
            System.out.print(x + " Is a ");
            checkVowel(x);
        }
    }
}
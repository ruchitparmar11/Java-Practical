import java.util.Scanner;

public class Practical_09 {
    static void checkPalindrome(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r = r + s.charAt(i);
        }
        if(s.equals(r)) {
            System.out.println(s + " is a Palindrome");
        }
        else {
            System.out.println(s + " is not a Palindrome");
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number or string : ");
            String s = sc.next();
            checkPalindrome(s);
        }
    }
}
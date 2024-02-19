import java.util.Scanner;

public class Practical_08 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a sentence: ");
            String sentence = sc.nextLine();

            int count = countCapitalWords(sentence);

            System.out.println("Number of words starting with capital letters: " + count);
        }
    }

    private static int countCapitalWords(String sentence) {
        String[] words = sentence.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (Character.isUpperCase(word.charAt(0))) {
                count++;
            }
        }

        return count;
    }
}
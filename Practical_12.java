import java.util.Random;

public class Practical_12 {
    public static void main(String[] args) {
        String plateNumber = generatePlateNumber();
        System.out.println("Generated Plate Number: " + plateNumber);
    }

    private static String generatePlateNumber() {
        StringBuilder plateNumber = new StringBuilder();

        // Generate three uppercase letters
        for (int i = 0; i < 3; i++) {
            char randomLetter = (char) ('A' + new Random().nextInt(26));
            plateNumber.append(randomLetter);
        }

        // Generate four random digits
        for (int i = 0; i < 4; i++) {
            int randomDigit = new Random().nextInt(10);
            plateNumber.append(randomDigit);
        }

        return plateNumber.toString();
    }
}

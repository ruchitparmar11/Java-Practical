import java.util.Scanner;

public class Practical_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter ten numbers
        System.out.println("Enter ten numbers :");
        System.out.println();

        // Read ten numbers from the user
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Invoke the method to reverse the numbers
        reverseNumbers(numbers);

        // Display the reversed numbers
        System.out.println();
        System.out.println("Reversed numbers:");
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println("Value at Position " + (i + 1) + " : " + numbers[i]);
        }
        sc.close();
    }

    // Method to reverse an array of numbers
    private static void reverseNumbers(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }
    }
}
public class Practical_18 {
    public static void bubbleSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int flag = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Use this command : java Practical18 <size> <element1> <element2>.....<elementN>");
            return;
        }
        int arrSize = Integer.parseInt(args[0]);
        if (args.length - 1 != arrSize) {
            System.out
                    .println("No of elements provided in command line argument does not match the specified arrSize ");
            return;
        }
        int arr[] = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = Integer.parseInt(args[i + 1]);
        }
        System.out.println("Before sort the elements");
        for (int i = 0; i < arrSize; i++) {
            System.out.print(arr[i] + " ");
        }
        bubbleSort(arr, arrSize);
        System.out.println("\nAfter sort the elements");
        for (int i = 0; i < arrSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
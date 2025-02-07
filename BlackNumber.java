import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BlackNumber {
    public static void main(String args[]) {
        try {
            File file = new File("input1.txt"); // Read input from file
            Scanner sc = new Scanner(file);

            int[] numbers = new int[100];
            int count = 0;

            while (sc.hasNextInt()) {
                int num = sc.nextInt();
                if (num < 0) {
                    break;
                }
                numbers[count++] = num;
            }

            sc.close(); // Close the scanner after reading the file

            // Processing the numbers
            for (int i = 0; i < count; i++) {
                int num = numbers[i];
                if (num % 7 == 0 && num % 8 == 0) {
                    numbers[i] = -6;
                } else if (num % 7 == 0) {
                    numbers[i] = -2;
                } else if (num % 8 == 0) {
                    numbers[i] = -9;
                }
            }

            // Print the processed output
            for (int i = 0; i < count; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println(); // Ensure a newline after output

        } catch (FileNotFoundException e) {
            System.out.println("Error: input1.txt file not found! Please check the file path.");
            System.exit(1); // Exit with an error code for Jenkins
        }
    }
}

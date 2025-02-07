import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AddOddEven2 {
    public static void main(String args[]) {
        try {
            File file = new File("input.txt"); // Corrected filename syntax
            Scanner sc = new Scanner(file);

            int size = sc.nextInt();
            int arr[] = new int[size];

            for (int i = 0; i < size; i++) { // Changed 'n' to 'size'
                arr[i] = sc.nextInt();
            }

            int odd = 0;
            int even = 0;

            for (int i = 0; i < size; i++) {
                if (arr[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            System.out.println("odd: " + odd);
            System.out.println("even: " + even);

            sc.close(); // Close the scanner
        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        }
    }
}

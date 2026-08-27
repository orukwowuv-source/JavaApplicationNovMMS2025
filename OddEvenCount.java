import java.util.Scanner;

public class OddEvenCount{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int oddCount = 0;
        int evenCount = 0;

        // Input 10 elements
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        // Count odd and even numbers
        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Display results
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);

        input.close();
    }
}
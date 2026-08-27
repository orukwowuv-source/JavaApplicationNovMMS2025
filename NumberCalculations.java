import java.util.Scanner;

public class NumberCalculations {

    public static void main(String[] args) {
        calculateResult();
    }

    public static void calculateResult() {

        Scanner input = new Scanner(System.in);

        int[] num = new int[10];

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            num[i] = input.nextInt();
        }

        int sum6to9 = num[5] + num[6] + num[7] + num[8];
        int sum249 = num[1] + num[3] + num[8];
        int sum2to5 = num[1] + num[2] + num[3] + num[4];

        double result = (double) (sum6to9 + sum249) / sum2to5;

        System.out.println("Final Result: " + result);
    }
}
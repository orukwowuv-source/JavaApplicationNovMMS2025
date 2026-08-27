public class NumberCalculation {

    public static void main(String[] args) {
        calculateResult();
    }

    public static void calculateResult() {
  
        int sum6to9 = 6 + 7 + 8 + 9;

        int sum249 = 2 + 4 + 9;
		
        int totalSum = sum6to9 + sum249;

        int sum2to5 = 2 + 3 + 4 + 5;

        double result = (double) totalSum / sum2to5;

        System.out.println("Final Result: " + result);
    }
}

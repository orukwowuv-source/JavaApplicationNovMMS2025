public class StaticMethod {

    //method
    public static void main(String[] args) {
        System.out.println(StaticMethod.addNumber(8, 45, 23));
        System.out.println(StaticMethod.addNumber(100, 500));
    }

    //method
    public static int addNumber(int num1, int num2, int num3) {
        int addition = num1 + num2 + num3;

        return addition;
    }

    public static int addNumber(int num1, int num2) {
        int addition = num1 + num2;

        return addition;
    }
}
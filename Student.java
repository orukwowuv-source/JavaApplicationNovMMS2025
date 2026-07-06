public class Student {

    // Static method that returns a student's name
    public static String getStudentName() {
        return "Victor Oruks";
    }

    public static void main(String[] args) {

        // Calling the static method
        String studentName = getStudentName();

        // Displaying the returned value
        System.out.println("Student Name: " + studentName);
    }
}
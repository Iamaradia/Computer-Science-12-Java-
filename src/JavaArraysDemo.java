import java.util.Arrays;

public class JavaArraysDemo {
    static int [] studentNumbers; // declare variable
    static int NUM_STUDENTS = 5;
    static String[] studentNames = new String[NUM_STUDENTS];

    public static void main(String[] args) {
        studentNumbers = new int[NUM_STUDENTS];

        for (int i = 0; i < NUM_STUDENTS; i++) {
            studentNumbers[i] = 10000 + i;
        }

        System.out.println(Arrays.toString(studentNumbers));
        // Parallel arrays organize information based
        // on index value
        // String[] studentNames = {"Alice", "Bob", "Charlie", "David", "Elmo"};
        studentNames[0] = "Alice";
        studentNames[1] = "Betty";
        studentNames[2] = "Charlie";
        studentNames[3] = "David";
        studentNames[4] = "Elmo";

        printStudents();
    }

    private static void printStudents() {
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.println(studentNames[i] + " has student number " + studentNumbers[i]);
        }
    }


}

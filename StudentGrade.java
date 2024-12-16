import java.util.*;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input for no.of subjects
        System.out.println("Enter the number of subjects:");
        int nsub = sc.nextInt();

        // creating an array for marks
        int[] marks = new int[nsub];
        int tmarks = 0;

        // taking marks as an input
        System.out.println("Enter the marks for each subject:");
        for (int i = 0; i < nsub; i++) {
            System.out.println("Subject " + (i + 1) + ":");
            marks[i] = sc.nextInt();
            tmarks += marks[i];
        }

        // calculating average
        double avg = tmarks / (double) nsub;

        // grade
        char grade;
        if (avg >= 90) {
            grade = 'A';
        } else if (avg >= 75) {
            grade = 'B';
        } else if (avg >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        // output
        System.out.println("\n--- Results---");
        System.out.println("Total Marks: " + tmarks);
        System.out.println("Average Marks: " + avg);
        System.out.println("Grade: " + grade);
    }
}

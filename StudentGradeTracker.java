import java.util.Scanner;

public class StudentGradeTracker {

    // Method to calculate letter grade
    public static String getLetterGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to calculate GPA based on letter grade
    public static double calculateGPA(String letterGrade) {
        switch (letterGrade) {
            case "A": return 4.0;
            case "B": return 3.0;
            case "C": return 2.0;
            case "D": return 1.0;
            default: return 0.0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Student Grade Tracker!");

        // Ask user for number of subjects or assignments
        System.out.print("Enter the number of subjects or assignments: ");
        int numSubjects = scanner.nextInt();
        
        double[] grades = new double[numSubjects];
        double total = 0;

        // Input grades for each subject or assignment
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter grade for subject " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            total += grades[i];
        }

        // Calculate average
        double average = total / numSubjects;

        // Get letter grade and GPA
        String letterGrade = getLetterGrade(average);
        double gpa = calculateGPA(letterGrade);

        // Display results
        System.out.println("\n--- Grade Summary ---");
        System.out.println("Average Grade: " + average);
        System.out.println("Letter Grade: " + letterGrade);
        System.out.println("GPA: " + gpa);

        scanner.close();
    }
}


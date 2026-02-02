import java.util.Scanner;
public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int number = input.nextInt();
        int[][] marks = new int[number][3];
        double[] percentage = new double[number];
        String[] grade = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter Physics marks of student " + (i + 1) + ": ");
            marks[i][0] = input.nextInt();
            System.out.print("Enter Chemistry marks of student " + (i + 1) + ": ");
            marks[i][1] = input.nextInt();
            System.out.print("Enter Maths marks of student " + (i + 1) + ": ");
            marks[i][2] = input.nextInt();
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks, enter again");
                i--;
            }
        }
        for (int i = 0; i < number; i++) {
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else if (percentage[i] >= 40) {
                grade[i] = "E";
            } else {
                grade[i] = "R";
            }
        }
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1) + " Physics: " + marks[i][0] + " Chemistry: " + marks[i][1] + " Maths: " + marks[i][2] + " Percentage: " + percentage[i] + " Grade: " + grade[i]);
        }
    }
}

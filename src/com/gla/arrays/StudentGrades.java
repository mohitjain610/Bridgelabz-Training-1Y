import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int number = input.nextInt();
        int[] physics = new int[number];
        int[] chemistry = new int[number];
        int[] maths = new int[number];
        double[] percentage = new double[number];
        String[] grade = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter Physics marks of student " + (i + 1) + ": ");
            physics[i] = input.nextInt();
            System.out.print("Enter Chemistry marks of student " + (i + 1) + ": ");
            chemistry[i] = input.nextInt();
            System.out.print("Enter Maths marks of student " + (i + 1) + ": ");
            maths[i] = input.nextInt();
            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks, enter again");
                i--;
            }
        }
        for (int i = 0; i < number; i++) {
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
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
            System.out.println("Student " + (i + 1) + " Physics: " + physics[i] + " Chemistry: " + chemistry[i] + " Maths: " + maths[i] + " Percentage: " + percentage[i] + " Grade: " + grade[i]);
        }
    }
}

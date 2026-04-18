import java.util.Scanner;

public class ScholarshipChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double gpa;

        System.out.print("Enter GPA (0.0 - 4.0): ");
        gpa = sc.nextDouble();

        if (gpa < 0 || gpa > 4) {
            System.out.println("Invalid GPA!");
        }
        else if (gpa >= 3.5) {
            System.out.println("You are eligible for Scholarship");
        } else {
            System.out.println("You are not Eligible for Scholarship");
        }

        sc.close();
    }
}
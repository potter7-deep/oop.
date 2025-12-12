
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] studentName = new String[12];
        double[] english = new double[12];
        double[] math = new double[12];
        double[] history = new double[12];
        double[] geography = new double[12];
        double[] science = new double[12];
        double[] programming = new double[12];
        double[] total = new double[12];
        char[] rank = new char[12];
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.print("Enter School Name: ");
        String schoolName = input.nextLine();
        System.out.print("Enter Teacher Name: ");
        String teacherName = input.nextLine();
        System.out.print("Enter Grade: ");
        String grade = input.nextLine();
        System.out.print("Enter Year: ");
        int year = input.nextInt();
        System.out.println("Enter number of students (max 12): ");
        int n = input.nextInt();
        input.nextLine();

        for(int i = 0; i < n; ++i) {
            System.out.print("\nEnter Student " + (i + 1) + " Name: ");
            studentName[i] = input.nextLine();
            System.out.print("English: ");
            english[i] = input.nextDouble();
            System.out.print("Math: ");
            math[i] = input.nextDouble();
            System.out.print("History: ");
            history[i] = input.nextDouble();
            System.out.print("Geography: ");
            geography[i] = input.nextDouble();
            System.out.print("Science: ");
            science[i] = input.nextDouble();
            System.out.print("Programming: ");
            programming[i] = input.nextDouble();
            input.nextLine();
            total[i] = english[i] + math[i] + history[i] + geography[i] + science[i] + programming[i];
            if (total[i] >= (double)540.0F) {
                rank[i] = 'A';
                ++countA;
            } else if (total[i] >= (double)480.0F) {
                rank[i] = 'B';
                ++countB;
            } else if (total[i] >= (double)420.0F) {
                rank[i] = 'C';
                ++countC;
            } else if (total[i] >= (double)360.0F) {
                rank[i] = 'D';
                ++countD;
            } else {
                rank[i] = 'F';
                ++countF;
            }
        }

        double engT = (double)0.0F;
        double mathT = (double)0.0F;
        double histT = (double)0.0F;
        double geoT = (double)0.0F;
        double sciT = (double)0.0F;
        double progT = (double)0.0F;

        for(int i = 0; i < n; ++i) {
            engT += english[i];
            mathT += math[i];
            histT += history[i];
            geoT += geography[i];
            sciT += science[i];
            progT += programming[i];
        }

        double engA = engT / (double)n;
        double mathA = mathT / (double)n;
        double histA = histT / (double)n;
        double geoA = geoT / (double)n;
        double sciA = sciT / (double)n;
        double progA = progT / (double)n;
        System.out.println("====================================================================================================================");
        System.out.printf("%50s\n", "School Name: " + schoolName);
        System.out.printf("%42s\n", "Teacher: " + teacherName);
        System.out.printf("%35s\n", "Grade: " + grade);
        System.out.printf("%37s\n", "Year: " + year);
        System.out.println("====================================================================================================================");
        System.out.printf("%-17s %-8s %-8s %-8s %-10s %-8s %-12s %-10s %-6s\n", "Student Name", "English", "Math", "History", "Geography", "Science", "Programming", "Total", "Rank");
        System.out.println("====================================================================================================================");

        for(int i = 0; i < n; ++i) {
            System.out.printf("%-17s %-8.2f %-8.2f %-8.2f %-10.2f %-8.2f %-12.2f %-10.2f %-6c\n", studentName[i], english[i], math[i], history[i], geography[i], science[i], programming[i], total[i], rank[i]);
        }

        System.out.println("====================================================================================================================");
        System.out.printf("%-17s %-8.2f %-8.2f %-8.2f %-10.2f %-8.2f %-12.2f %-10.2f\n", "", engT, mathT, histT, geoT, sciT, progT, engT + mathT + histT + geoT + sciT + progT);
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-17s %-8.2f %-8.2f %-8.2f %-10.2f %-8.2f %-12.2f %-10.2f\n", "", engA, mathA, histA, geoA, sciA, progA, (engA + mathA + histA + geoA + sciA + progA) / (double)6.0F);
        System.out.println("====================================================================================================================");
        System.out.println("\t\t\t\t  Ranks    A's: " + countA + "   B's: " + countB + "   C's: " + countC + "   D's: " + countD + "   F's: " + countF);
    }
}
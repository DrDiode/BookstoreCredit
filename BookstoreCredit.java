import java.util.Scanner;

public class BookstoreCredit
{
    public static void main(String[] args)
    {
        // Variables and constants
        String studentName;
        double Credit;
        double gradePoint;
        Scanner keyboard = new Scanner(System.in);

        // input phase
        System.out.print("Enter Student's name >> ");
        studentName = keyboard.nextLine();
        System.out.print("Enter the grade point average >> ");
        gradePoint = keyboard.nextDouble();
        Credit = gradePoint * 10;
        calculateGrade(studentName, gradePoint, Credit);
    }

    static void calculateGrade(String StuentName, double gradePoint, double Credit)
    {
        System.out.println("The student " + StuentName + " grade point average is " + gradePoint + " and they have $ " + Credit + " in credits.");
    }
}
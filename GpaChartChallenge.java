import java.util.Scanner;
/**
 * Note: When you complete this challenge, you should add your name as an
 * author (and remove this note).
 *
 * @author Qurrat-al-Ain Siddiqui
 */
public class GpaChartChallenge {

    public void run() {
        // Declare variables and constants.

        final double HONORS = 3.6;
        final double FAIL = 2.0;
        int students = 0;
        Scanner keyboard = new Scanner (System.in);

        // Get user input for # of students
        System.out.println("Enter the number of students: ");
        students = keyboard.nextInt();

        // If the user input is negative or 0 (an invalid input)
        if (students <= 0)
        {
            System.out.println("ERROR: The number of students you have entered is invalid. The program will now terminate.");
        }
        else
        {
            // Declare and initialize variables for GPA Calculations
            int honours = 0;
            int pass = 0;
            int fail = 0;
            int count = 0;

            // While loop 
            while (count < students)
            {
                double gpa = keyboard.nextDouble();

                if (gpa >= HONORS)

                {
                    honours++;
                } 

                else if (gpa < FAIL)

                {
                    fail++;
                }
                
                else
                
                {
                    pass++;
                }

                count++;
            }

            System.out.println("GPA Distribution");
            System.out.println();

            // Output for Honours
            System.out.printf("%11s", "Honours   :");
            while (honours > 0)
            {
                System.out.print("*");
                honours--;
            } 

            // Output for Pass
            System.out.printf("%n%11s", "Pass      :");
            while (pass > 0)
            {
                System.out.print("*");
                pass--;
            }

            // Output for Fail
            System.out.printf("%n%11s","Fail      :");
            while (fail > 0)
            {
                System.out.print("*");
                fail--;
            }
        }
    }
}
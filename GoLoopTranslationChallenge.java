import java.util.Scanner;
/**
 * 
 * @author Qurrat-al-Ain Siddiqui
 */
public class GoLoopTranslationChallenge {

    public void run() {
        // Declare variables and constants

        final int STARTING_LIFE = 100;
        int lifeLeft = STARTING_LIFE;
        boolean isAlive = true;
        String changeDisplay = "";

        Scanner keyboard = new Scanner (System.in);

        while (isAlive)
        { 
            int lifeChange;
            lifeChange = keyboard.nextInt();

            if (lifeChange <= 0)
            { 
                changeDisplay = "DMG";
            } 
            else
            {
                changeDisplay = "HEAL";
            }

            lifeLeft += lifeChange;

            if (lifeLeft > STARTING_LIFE)
            {
                lifeLeft = STARTING_LIFE;
            }    
            else if (lifeLeft <= 0)
            { 
                lifeLeft = 0;
                isAlive = false;
            }  

            if (lifeChange < 0)
            {
                lifeChange *= -1;
            }

            System.out.printf("%5s(%03d): LIFE %03d%n", changeDisplay, lifeChange, lifeLeft);

        }   

        System.out.println("Dead now.");

    }
}    

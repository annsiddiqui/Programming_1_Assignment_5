import java.util.Random;
/**
 * 
 *
 * @author Qurrat-al-Ain Siddiqui
 */
public class GenderBiasChallenge {
    public void run() {
        // Decare variables.
        int run = 1; // Run is the loop control variable
        final int RUN_LIMIT = 11; // Run limit is number of iterations the loop will go through the code.

        // Generate random numbers.
        Random randomGenerator = new Random (1);

        // Format table output. 
        System.out.println("Run#  M : F");

        // Loop (while loop)
        while (run < RUN_LIMIT)
        {
            // These are variables for the while loop of the mother part. These 

            int male = 0;
            int female = 0;
            final int PROCESSED_MOTHERS = 10000;
            int mothers = 0; // Number of mothers is the loop controlled variable.

            while (mothers < PROCESSED_MOTHERS)
            { 

                boolean childMale = randomGenerator.nextBoolean(); // If true, then child is male. If false, it's a female and mother -1.

                if (childMale)
                {
                    male++;
                }    
                else
                { 
                    female ++;
                    mothers++;
                }
            }

            double ratio = ((double)male/female);
            System.out.printf("%4d%2s%1s%1s%1s%1s%.5f%n",run,"  ","1"," ",":"," ",ratio);
            run++;

        }
    }
}


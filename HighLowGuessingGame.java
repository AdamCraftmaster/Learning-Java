import java.util.Scanner;

public class HighLowGuessingGame {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int secretNum = 1+(int)(Math.random()*100);
            boolean guessCorrect = false;
            int tries = 1;

            while(!guessCorrect)
            {
                System.out.print("Please type your guess: ");
                String guessTemp = scanner.nextLine();
                int guess = Integer.parseInt(guessTemp);

                if (guess > secretNum) {
                    System.out.println("Your guess was too high. Please try again. Tries = " + tries);
                    tries++;
                }
                else if (guess < secretNum) { 
                    System.out.println("Your guess was too low. Please try again. Tries = " + tries);
                    tries++;
                }
                else if (guess == secretNum) {
                    System.out.println("You got it in " + tries + " tries");
                    guessCorrect = true;
                    scanner.close();
                }
                else System.out.println("Something probably went wrong, try again. You inputted: " + guess);
/*
                switch(secretNum)
                {
                    case (guess > secretNum):
                        System.out.println("Your guess was too high. Please try again.");
                    case (guess < secretNum):
                        System.out.println("Your guess was too low. Please try again.");
                    case (guess == secretNum):
                        System.out.println("You got it!");
                    default:
                        System.out.println("Something probably went wrong, try again. You inputted: " + guess);

                }
*/
            }

        }
}    


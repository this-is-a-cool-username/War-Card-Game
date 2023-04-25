import java.util.*;

public class WarGame {

    void warRules() {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to War");
        System.out.println("You will be playing against the computer");
        System.out.println("Press 's' to select the card at the top of your stack and play it");
        System.out.println("Once the winner is determined, press 'c' to collect your cards");
        System.out.println("The player who holds the highest card value, ace being the highest, wins the round");
        System.out.println("If both cards are of equal value, both players draw 3 cards from the top of the deck and play a fourth");
        System.out.println("The player who has the highest card value wins all 10 cards, unless there is another draw.");
        System.out.println("If there is another draw, then both players repeat the step where 3 cards are drawn");
        System.out.println("The player who runs out of cards first loses");
        System.out.println("Would you like to play?: ");
        System.out.println("Enter 'y' for yes, 'n' for no");
        String playGame = input.next();
        playGame.toLowerCase();
        if (playGame.equals("y")) {
            warGame();
        } else if (playGame.equals("n")) {
            System.out.println("Goodbye");
        } else {
            System.out.println("Type a real value");
        }

    }

    public void warGame() {
        Scanner input = new Scanner(System.in);
        Cards c = new Cards();
        //System.out.println(c.playerHand);
        System.out.println(c.computerHand);
        System.out.println(c.computerHand.pop());
        System.out.println(c.computerHand);
        Collections.shuffle(c.computerHand);
        System.out.println(c.computerHand);
        Collections.shuffle(c.playerHand);
      /*while(c.computerHand.size() != 0 || c.playerHand.size() != 0);
        {
            if(c.playerHand.get(0) < c.computerHand.get(0)){
                System.out.println("ok");
            }
            System.out.println("Top player card is: " + c.playerHand.peek());
            System.out.println("Top computer card is: " + c.computerHand.peek());
            String grab = input.next();



        }*/
    }
}
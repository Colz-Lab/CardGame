import java.util.ArrayList;

public class TargetSwapCard extends Card {

    public TargetSwapCard() {
        int pointValue = 0 ;

        super(pointValue);
    }

    @Override
    public void play(Player currentPlayer, ArrayList<Player> allPlayers) {
        currentPlayer.addPoints(super.getPointValue());

        System.out.println(currentPlayer.getName() + " played " + this);
        System.out.println(currentPlayer.getName() + " now has " + currentPlayer.getNumPoints() + " points.");

        swapDeck(currentPlayer, allPlayers);
    }

    private void swapDeck(Player currentPlayer, ArrayList<Player> allPlayers) {
        boolean validTargetFound = false;
        Player targetPlayer = null;

        while (!validTargetFound){
            String targetName = Input.getUserString("Choose a player to swap from: ");

            if (targetName.equalsIgnoreCase(currentPlayer.getName())){
                System.out.println("You cannot swap hands with yourself!");
                continue;
            }
            for (Player p: allPlayers){
                if (p.getName().equalsIgnoreCase(targetName)){
                    targetPlayer = p;
                    validTargetFound = true;
                    break;
                }
            }
        }

        System.out.println("\u001B[1mSwapping Hands with " + targetPlayer.getName() + "!\u001B[0m");

        ArrayList<Card> tempHand = currentPlayer.getHand();
        currentPlayer.setHand(targetPlayer.getHand());
        targetPlayer.setHand(tempHand);
    }

    @Override
    public String toString() {
        return "TargetSwap Card { point value: " + super.getPointValue() + "}";
    }
}

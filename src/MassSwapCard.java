import java.util.ArrayList;

public class MassSwapCard extends Card {

    public MassSwapCard() {
        int pointValue = 0 ;

        super(pointValue);
    }

    @Override
    public void play(Player currentPlayer, ArrayList<Player> allPlayers) {
        currentPlayer.addPoints(super.getPointValue());

        System.out.println(currentPlayer.getName() + " played " + this);
        System.out.println(currentPlayer.getName() + " now has " + currentPlayer.getNumPoints() + " points.");

        massSwapDeck(allPlayers);
    }

    private void massSwapDeck(ArrayList<Player> allPlayers) {
        ArrayList<Card> tmp = null;
        if (allPlayers != null && !allPlayers.isEmpty()){
            tmp = allPlayers.get(allPlayers.size() - 1).getHand();
        }

        for (int i = allPlayers.size() - 1; i > 0; i--){
            allPlayers.get(i).setHand(allPlayers.get(i - 1).getHand());
        }

        allPlayers.get(0).setHand(tmp);
    }

    @Override
    public String toString() {
        return "MassSwap Card { point value: " + super.getPointValue() + "}";
    }
}

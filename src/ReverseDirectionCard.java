import java.util.ArrayList;

public class ReverseDirectionCard extends Card {

    public ReverseDirectionCard() {

        // Points gained from playing this card
        int minPoints = 4;
        int maxPoints = 10;
        int pointValue = Rand.randomInt(minPoints, maxPoints + 1);
        super(pointValue);
    }

    @Override
    public void play(Player currentPlayer, ArrayList<Player> allPlayers) {
        currentPlayer.addPoints(super.getPointValue());

        System.out.println(currentPlayer.getName() + " played " + this);
        System.out.println(currentPlayer.getName() + " now has " + currentPlayer.getNumPoints() + " points.");

        reverseDir(currentPlayer, allPlayers);
    }

    public void reverseDir(Player currentPlayer, ArrayList<Player> allPlayers){
        int playerIndex = allPlayers.indexOf(currentPlayer);
        ArrayList<Player> newPlayerOrder = new ArrayList<Player>();
        for(int i = 0; i < allPlayers.size(); i++){
            newPlayerOrder.add(allPlayers.get(playerIndex));
            playerIndex--;

            if(playerIndex < 0){
                playerIndex = allPlayers.size() - 1;
            }
        }
        allPlayers.clear();
        allPlayers.addAll(newPlayerOrder);
    }

    @Override
    public String toString() {
        return "ReverseDirection Card { point value: " + super.getPointValue() + " }";
    }
}

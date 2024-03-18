package players;

import game.Player;

public class CarreraPlayer extends Player {

    public CarreraPlayer(String name) {
        super(name);
    }

    @Override
    protected void takePlayerTurn() {

    }

    @Override
    protected boolean shouldFold() {
        if (isBetActive()) {
            if (getGameState().getNumRoundStage() == 1) {
                int temp = getHandCards().get(0).getValue() - getHandCards().get(1).getValue();
                if (!(temp < -3 || temp > 3)) {

                }
            }
        }
        return false;
    }

    @Override
    protected boolean shouldCheck() {
        return false;
    }

    @Override
    protected boolean shouldCall() {
        return false;
    }

    @Override
    protected boolean shouldRaise() {
        return false;
    }

    @Override
    protected boolean shouldAllIn() {
        return false;
    }
}

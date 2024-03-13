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

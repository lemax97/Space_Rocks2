package space.rock.com;

public class SRGame extends BaseGame {
    @Override
    public void create() {
        GameScreen gameScreen = new GameScreen(this);
        setScreen(gameScreen);
    }
}

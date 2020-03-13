import org.newdawn.slick.*;

public class Game {
    public static void main(String[] args) throws SlickException {
        CannonGame game = new CannonGame("vv");
        AppGameContainer ap = new AppGameContainer(game,800,600,false);
        ap.start();
    }

}

class CannonGame extends BasicGame {

    public CannonGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

    }
}

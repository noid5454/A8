import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void testWasCorrectlyAnswered() {
        game.add("player1");
        game.add("player2");
        game.roll(1);
        assertTrue(game.wasCorrectlyAnswered());
    }

    @Test
    public void testRoll() {
        game.add("player1");
        game.roll(5);
        assertEquals(5, game.places[0]);
    }



}

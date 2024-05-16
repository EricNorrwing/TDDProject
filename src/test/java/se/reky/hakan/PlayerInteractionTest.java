package se.reky.hakan;

import org.junit.jupiter.api.*;
import se.reky.hakan.model.Player;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerInteractionTest {

    private Player player;

    @BeforeEach
    public void setup() {
        player = new Player();
        createPlayerInteraction("Eric");
    }

    private PlayerInteraction createPlayerInteraction(String dataForScanner) {
        Scanner scanner = new Scanner(dataForScanner);
        IOHandler ioHandler = new IOHandler(scanner);
        SimplePlayerInteraction playerInteraction = new SimplePlayerInteraction(ioHandler);
        playerInteraction.setupPlayer(player);
        return playerInteraction;
    }


    @Test
    @DisplayName("Testing player setup")
    public void testPlayerSetup() {
        assertEquals("Eric", player.getName());
    }

    @Test
    @DisplayName("Testing player health update")
    public void testUpdatePlayerHealth() {
        PlayerInteraction playerInteraction = createPlayerInteraction("Eric");
        player.setHp(10);
        playerInteraction.updatePlayerHealth(player, -5);
        assertEquals(5, player.getHp());
    }
}

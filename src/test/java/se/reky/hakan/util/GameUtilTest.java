package se.reky.hakan.util;

import org.junit.jupiter.api.*;
import se.reky.hakan.GameException;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GameUtilTest {

    private GameUtil gameUtil;

    @BeforeEach
    public void setUp() {
        gameUtil = new GameUtil();
    }

    @Test
    @DisplayName("Testing that gameUtil throws GameException")
    public void testToLowerCaseButFirstLetterCapitalizedWithNullInput() {
        assertThrows(GameException.class, () -> {
            gameUtil.toLowerCaseButFirstLetterCapitalized(null);
        });
    }
}

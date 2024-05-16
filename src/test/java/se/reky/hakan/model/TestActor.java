package se.reky.hakan.model;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestActor {

    private Goblin goblin;
    private Guard guard;

    @BeforeEach
    public void setup() {
        goblin = new Goblin("Goblin", 100, 5);
        guard = new Guard("Guard", 20, 20);
    }

    @Test
    @DisplayName("Testing the attack method")
    public void testAttack() {
        int initialHp = guard.getHp();
        goblin.attack(guard);
        int expectedHp = initialHp - goblin.getDamage();
        assertEquals(expectedHp, guard.getHp());
    }
}

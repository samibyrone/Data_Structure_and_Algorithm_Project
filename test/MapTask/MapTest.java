package MapTask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MapTest {

    private Map map;

    @BeforeEach
    public void setUp() {
        map = new Map();
    }

    @Test
    public void testThatMapIsEmpty() {
        map.size();
        map.isEmpty();
        assertTrue(map.isEmpty());
    }
}

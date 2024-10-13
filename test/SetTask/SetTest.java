package SetTask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {

    private Set set;

    @BeforeEach
    public void setUp() {
        set = new Set();
    }

    @Test
    public void testThatSetIsEmpty() {
        set.size();
        set.isEmpty();
        assertTrue(set.isEmpty());
    }

    private void main_set() {
        set.size();
        set.isEmpty();
        set.add("Samibyrone");
        set.add("Semicolon");
        set.add("Expendable");
        set.add("Fantastic");
        set.add("Exceptional");
        assertEquals(set.size(), 5);
    }

    @Test
    public void test_that_set_is_not_empty() {
        set.size();
        set.isEmpty();
        set.add("Samibyrone");
        set.add("Semicolon");
        assertEquals(set.size(), 2);
        assertFalse(set.isEmpty());
    }

    @Test
    public void test_that_set_can_add_element_to_set_list() {
        main_set();
        assertTrue(set.contains("Samibyrone"));
        assertFalse(set.contains("African"));
        assertFalse(set.isEmpty());
    }

    @Test
    public void test_that_set_can_remove_element_from_set_list() {
        main_set();
        set.remove("Expendable");
        assertEquals(set.size(), 4);
        assertTrue(set.contains("Fantastic"));
        assertFalse(set.isEmpty());
    }

    @Test
    public void test_that_set_can_clear_all_element_from_set_list() {
        main_set();
        assertTrue(set.contains("Samibyrone"));
        assertFalse(set.contains("Data-Structure-and-Algorithm"));
        set.clear();
        assertEquals(set.size(), 0);
        assertTrue(set.isEmpty());
    }

    @Test
    public void test_that_set_can_clear_all_elements_from_set_and_add_to_the_list() {
        main_set();
        assertTrue(set.contains("Samibyrone"));
        assertFalse(set.contains("Data-Structure-and-Algorithm"));
        set.clear();
        assertEquals(set.size(), 0);
        assertTrue(set.isEmpty());
        set.add("It's_a_Beautiful_day_to_be_Happy");
        set.add("Encyclopedia");
        assertEquals(set.size(), 2);
        assertFalse(set.isEmpty());
    }

}

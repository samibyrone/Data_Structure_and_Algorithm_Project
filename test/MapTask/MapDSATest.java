package MapTask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MapDSATest {

    private MapDSA map;

    @BeforeEach
    public void setUp() {
        map = new MapDSA();
    }

    @Test
    public void testThatMapIsEmpty() {
        map.size();
        map.isEmpty();
        assertTrue(map.isEmpty());
    }

    @Test
    public void testThatMapIsNotEmpty() {
        map_menu();
        assertEquals(map.size(), 5);
        assertFalse(map.isEmpty());
    }

    private void map_menu() {
        map.size();
        map.isEmpty();
        map.put("Samibyrone", 1);
        map.put("Semicolon", 2);
        map.put("Expendable", 3);
        map.put("Fantastic", 4);
        map.put("Exceptional", 5);
    }

    @Test
    public void test_that_map_can_add_element_and_get_element_on_the_map_list() {
        map_menu();
        assertEquals(map.get("Samibyrone"), 1);
        assertEquals(map.get("Fantastic"), 4);
        assertNull(map.get("Data-Structure-and-Algorithms"), "This element doesn't exist");
        assertEquals(map.size(), 5);
        assertFalse(map.isEmpty());
    }

    @Test
    public void test_that_map_can_compute_element_from_map_list() {
        map_menu();
        assertEquals(map.get("Semicolon"), 2);
        assertEquals(map.get("Exceptional"), 5);
        map.compute("Samibyrone", (x, y) -> y + 1);
        assertEquals(map.get("Semicolon"), 2);
        assertEquals(map.size(),5);
        assertFalse(map.isEmpty());
    }

    @Test
    public void test_that_map_can_compute_ifAbsent_element_from_map_list(){
        map_menu();
        assertEquals(map.get("Fantastic"), 4);
        assertEquals(map.get("Semicolon"), 2);
        map.computeIfAbsent("Olamirewaju", p -> 6);
        assertEquals(map.get("Olamirewaju"), 6);
        assertEquals(map.size(),6);
        assertFalse(map.isEmpty());
    }

    @Test
    public void test_that_map_can_compute_ifPresent_element_from_map_list() {
        map_menu();
        assertEquals(map.get("Semicolon"), 2);
        assertEquals(map.get("Exceptional"), 5);
        map.computeIfPresent("Fantastic", (x, y) -> y * 2);
        assertEquals(map.get("Fantastic"), 8);
        assertEquals(map.size(),5);
        assertFalse(map.isEmpty());
    }

    @Test
    public void test_that_map_containsKey_in_element_on_map_list(){
        map_menu();
        map.put("Faithfullness", 6);
        assertEquals(map.get("Semicolon"), 2);
        assertEquals(map.get("Exceptional"), 5);
        assertTrue(map.containsKey("Expendable"));
        assertTrue(map.containsKey("Fantastic"));
        assertFalse(map.containsKey("Encyclopedia"));
        assertEquals(map.size(),6);
        assertFalse(map.isEmpty());
    }

    @Test
    public void test_that_map_containsValue_in_element_on_map_list(){
        map_menu();
        map.put("Encyclopedia", 6);
        map.put("Faithfullness", 7);
        map.put("Software-Engineer", 8);
        assertEquals(map.get("Fantastic"), 4);
        assertEquals(map.get("Encyclopedia"), 6);
        assertEquals(map.get("Faithfullness"), 7);
        assertEquals(map.get("Software-Engineer"), 8);
        assertTrue(map.containsValue(2));
        assertTrue(map.containsValue(4));
        assertTrue(map.containsValue(6));
        assertTrue(map.containsValue(8));
        assertEquals(map.size(),8);
        assertFalse(map.isEmpty());
    }

    @Test
    public void test_that_map_contains_in_element_can_be_cleared_from_map_list(){
        map_menu();
        map.put("Encyclopedia", 6);
        map.put("Faithfullness", 7);
        map.put("Software-Engineer", 8);
        map.clear();
        assertEquals(map.size(), 0);
        assertTrue(map.isEmpty());
    }
}

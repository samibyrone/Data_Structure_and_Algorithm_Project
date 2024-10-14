package ArrayListTask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Array_ListTest {

    private Array_List arrayList;

    @BeforeEach
    public void setUp() {
        arrayList = new Array_List();
    }

    @Test
    public void test_that_arrayList_is_empty() {
        arrayList.size();
        assertEquals(arrayList.size(), 0);
        assertTrue(arrayList.isEmpty());
    }

    @Test
    public void test_that_arrayList_can_add_element_to_arrayList() {
        ArrayList_menu();
    }

    private void ArrayList_menu() {
        arrayList.size();
        arrayList.add("Samibyrone");
        arrayList.add("Semicolon");
        arrayList.add("Fantastic");
        assertEquals(arrayList.size(), 3);
        assertFalse(arrayList.isEmpty());
    }

    @Test
    public void test_that_arrayList_can_remove_element_from_arrayList() {
        ArrayList_menu();
        arrayList.add("Expendable");
        arrayList.remove("Fantastic");
        assertEquals(arrayList.size(), 3);
        assertFalse(arrayList.isEmpty());
    }

    @Test
    public void test_that_arrayList_can_get_element_from_index_position() {
        ArrayList_menu();
        arrayList.add("Expendable");
        arrayList.add("Exceptional");
        assertEquals("Fantastic", arrayList.get(2));
        assertEquals(arrayList.size(), 5);
    }

    @Test
    public void test_that_arrayList_can_get_element_of_index_not_on_the_list() {
        ArrayList_menu();
        arrayList.add("Expendable");
        arrayList.add("Exceptional");
        assertNull(arrayList.get(10));
        assertEquals(arrayList.size(), 5);
        assertFalse(arrayList.isEmpty());
    }

    @Test
    public void test_that_arrayList_can_resize_element_in_the_array_position() {
        ArrayList_menu();
        arrayList.add("Expendable");
        arrayList.add("Exceptional");
        arrayList.resize();
        for(int array = 0; array < 10; array++) {
            arrayList.add("Encyclopedia" + array);
        }
        assertEquals(arrayList.size(), 15);
        assertFalse(arrayList.isEmpty());
    }

    @Test
    public void test_that_arrayList_can_add_and_resize_element_in_the_array_position() {
        ArrayList_menu();
        arrayList.add("Expendable");
        arrayList.add("Exceptional");
        arrayList.resize();
        for(int array = 0; array < 10; array++) {
            arrayList.add("Encyclopedia" + array);
        }
        assertEquals(arrayList.size(), 15);
        arrayList.add("Abundance");
        assertEquals(arrayList.element(), 100);
        assertEquals(arrayList.size(), 16);
        assertFalse(arrayList.isEmpty());
    }

    @Test
    public void test_that_arrayList_can_add_and_resize__and_remove_element_in_the_array_position() {
        ArrayList_menu();
        arrayList.add("Expendable");
        arrayList.add("Exceptional");
        arrayList.resize();
        for(int array = 0; array < 10; array++) {
            arrayList.add("Encyclopedia" + array);
        }
        assertEquals(arrayList.size(), 15);
        arrayList.add("Abundance");
        assertEquals("Abundance",arrayList.get(15));
        assertEquals(arrayList.element(), 100);
        assertEquals(arrayList.size(), 16);
        assertFalse(arrayList.isEmpty());
    }
}


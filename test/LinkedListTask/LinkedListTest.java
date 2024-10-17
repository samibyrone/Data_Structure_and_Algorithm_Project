package LinkedListTask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    private LinkedList myList;

    @BeforeEach
    public void setUp() {
        myList = new LinkedList();
    }

    @Test
    public void testThatLinkedListIsEmpty() {
        myList.size();
        myList.isEmpty();
        assertTrue(myList.isEmpty());
    }

    @Test
    public void test_that_linkedList_can_add_element_list() {
        linkedList_menu();
        assertEquals(myList.size(), 5);
        assertFalse(myList.isEmpty());
    }

    private void linkedList_menu() {
        myList.size();
        myList.isEmpty();
        myList.add(95);
        myList.add(46);
        myList.add(79);
        myList.add(22);
        myList.add(77);
    }

    @Test
    public void test_that_linkedList_can_clone_element() {
        linkedList_menu();
        myList.add(789);
        myList.clone();
        LinkedList clonedList = myList.clone();
        assertEquals(myList.size(), 6);
        assertEquals(6, clonedList.get(22));
    }

    @Test
    public void test_that_linkedList_can_clear_element() {
        linkedList_menu();
        myList.add(789);
        myList.clear();
        assertEquals(myList.size(), 0);
        assertTrue(myList.isEmpty());
    }

    @Test
    public void test_that_linkedList_can_remove_element() {
        linkedList_menu();
        myList.add(789);
        myList.remove(22);
        assertEquals(myList.size(), 5);
        assertFalse(myList.isEmpty());
    }

    @Test
    public void test_that_linkedList_can_get_elements_in_a_list() {
        linkedList_menu();
        myList.add(789);
        myList.add(750);
        assertEquals(myList.get(789), 789);

    }
}

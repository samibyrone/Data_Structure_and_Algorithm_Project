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
        myList.add(296);
        LinkedList clonedList = myList.clone();
        assertEquals(myList.size(), 7);
        assertEquals(6, clonedList.get(296));
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
        assertEquals(myList.get(3), 22);
        assertEquals(myList.get(6), 750);
        assertEquals(myList.size(), 7);
        assertFalse(myList.isEmpty());
    }

    @Test
    public void test_that_linkedList_can_remove_and_check_if_element_contains_in_the_list() {
        linkedList_menu();
        myList.add(789);
        myList.add(750);
        myList.remove(79);
        assertTrue(myList.contains(789));
        assertFalse(myList.contains(79));
        assertEquals(myList.size(), 6);
        assertFalse(myList.isEmpty());
    }

    @Test
public void test_that_linkedList_can_push_and_pop_elements_to_the_list() {
        linkedList_menu();
        myList.push(20);
        myList.push(49);
        assertEquals(myList.size(), 7);
        assertEquals(myList.pop(), 49);
        assertEquals(myList.pop(), 20);
        assertEquals(myList.pop(), 95);
        assertEquals(myList.pop(), 46);
        assertEquals(myList.size(),3);
        myList.add(789);
        myList.add(750);
        assertEquals(myList.size(), 5);
        assertFalse(myList.isEmpty());
    }

    @Test
    public void test_that_linkedList_can_set_elements_in_the_list() {
        linkedList_menu();
        myList.add(70);
        myList.add(99);
        myList.set(0, 546);
        myList.set(5, 295);
        myList.set(2, 789);
        assertEquals(myList.get(0), 546);
        assertEquals(myList.get(5), 295);
        assertEquals(myList.get(2), 789);
        assertEquals(myList.size(), 7);
        assertFalse(myList.isEmpty());
    }

    @Test
    public void test_that_linkedList_can_push_and_poll_elements_to_the_list() {
        linkedList_menu();
        myList.push(20);
        myList.push(49);
        assertEquals(myList.size(), 7);
        assertEquals(myList.poll(), 49);
        assertEquals(myList.poll(), 20);
        assertEquals(myList.poll(), 95);
        assertEquals(myList.poll(), 46);
        assertEquals(myList.size(),3);
        myList.add(789);
        myList.add(750);
        assertEquals(myList.size(), 5);
        assertFalse(myList.isEmpty());
    }

    @Test
    public void test_that_linkedList_can_peek_into_elements_of_the_list() {
        linkedList_menu();
        myList.push(20);
        myList.push(49);
        assertEquals(myList.peek(), 49);
        assertEquals(myList.size(), 7);
        myList.push(99);
        assertEquals(myList.peek(), 99);
        assertFalse(myList.isEmpty());
    }

    @Test
    public void test_that_linkedList_offer_elements_to_the_list() {
        linkedList_menu();
        myList.offer(91);
        assertEquals(myList.get(5), 91);
        assertEquals(myList.size(), 6);
        assertFalse(myList.isEmpty());
    }
}
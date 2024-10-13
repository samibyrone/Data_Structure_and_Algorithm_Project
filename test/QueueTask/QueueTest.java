package QueueTask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class QueueTest {

    private Queue queue;

    @BeforeEach
    public void setUp() {
        queue = new Queue(10);
    }

    @Test
    public void testForQueueIsEmpty() {
        queue.size();
        assertEquals(queue.size(), 0);
        assertTrue(queue.isEmpty());
    }

    @Test
    public void test_that_empty_queue_can_add_element_to_queue(){
        queue.size();
        queue.isEmpty();
        queue.add("Samibyrone");
        queue.add("Semicolon");
        queue.add("Fantastic");
        assertEquals(queue.size(), 3);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void test_that_queue_can_add_and_offer_more_element_to_queue(){
        queue.size();
        queue.isEmpty();
        queue.add("Samibyrone");
        queue.add("Semicolon");
        queue.add("Fantastic");
        queue.add("Expendables");
        assertEquals(queue.size(), 4);
        queue.offer("Exceptional");
        assertEquals(queue.size(), 5);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void test_that_queue_can_add_and_peek_into_element_on_queue(){
        queue.size();
        queue.isEmpty();
        queue.add("Samibyrone");
        queue.add("Semicolon");
        queue.add("Fantastic");
        queue.add("Expendables");
        queue.add("Exceptional");
        assertEquals(queue.size(), 5);
        assertEquals("Samibyrone", queue.peek());
        assertEquals(queue.size(), 5);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void test_that_queue_can_add_and_remove_from_queue(){
        queue.size();
        queue.isEmpty();
        queue.add("Samibyrone");
        queue.add("Semicolon");
        queue.add("Fantastic");
        queue.add("Expendables");
        queue.add("Exceptional");
        assertEquals(queue.size(), 5);
        assertEquals("Expendables", queue.remove());
        assertEquals(queue.size(), 4);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void test_that_queue_can_poll_from_queue(){
        queue.size();
        queue.isEmpty();
        queue.add("Samibyrone");
        queue.add("Semicolon");
        queue.add("Fantastic");
        queue.add("Expendables");
        queue.add("Exceptional");
        assertEquals(queue.size(), 5);
        assertEquals("Samibyrone", queue.poll());
        assertEquals(queue.size(), 4);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void test_that_queue_contains_and_element_from_queue(){
        queue.size();
        queue.isEmpty();
        queue.add("Samibyrone");
        queue.add("Semicolon");
        queue.add("Fantastic");
        queue.add("Expendables");
        queue.add("Exceptional");
        assertEquals(queue.size(), 5);
        assertTrue(queue.contains("Semicolon"));
    }
}

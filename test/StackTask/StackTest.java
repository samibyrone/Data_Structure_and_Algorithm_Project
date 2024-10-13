package StackTask;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    private Stack stack;

    @BeforeEach
    public void setUp() {
         stack = new  Stack(10);
    }

    @Test
    public void testForStackIsEmpty() {
        stack.isEmpty();
        assertTrue(true);
    }

    @Test
    public void testForStackIsNotEmpty() {
        stack.isEmpty();
        stack.push("B_String");
        stack.push("Samibyrone");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testThatStack_CanPush() {
        stack.isEmpty();
        stack.push("B_String");
        stack.push("Semicolon");
        stack.push("Agbaje");
        assertEquals(stack.size(), 3);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testThatStack_CanPop() {
        stack.isEmpty();
        stack.push("B_String");
        stack.push("Semicolon");
        stack.push("Agbaje");
        stack.pop();
        stack.pop();
        assertEquals(stack.size(), 1);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testThatStack_Can_push_and_peek() {
        stack.isEmpty();
        stack.push("B_String");
        stack.push("Semicolon");
        stack.push("Agbaje");
        assertEquals(stack.peek(), "Agbaje");
        assertEquals(stack.size(), 3);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testThatStack_Can_push_and_pop_and_check_the_size() {
        stack.isEmpty();
        stack.push("B_String");
        stack.push("Semicolon");
        stack.push("Agbaje");
        stack.push("Africa");
        stack.pop();
        stack.pop();
        assertFalse(stack.isEmpty());
        assertEquals(stack.size(), 2);

    }

}

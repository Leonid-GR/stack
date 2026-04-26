import org.example.Stack;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test
    void testPushAndSize() {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);

        assertEquals(2, stack.size());
    }

    @Test
    void testPeek() {
        Stack<Integer> stack = new Stack<>();

        stack.push(100);
        stack.push(200);

        assertEquals(200, stack.peek());
        assertEquals(2, stack.size());
    }

    @Test
    void testPop() {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(10);

        assertEquals(10, stack.pop());
        assertEquals(1, stack.size());
    }

    @Test
    void testIsEmpty() {
        Stack<Integer> stack = new Stack<>();

        assertTrue(stack.isEmpty());

        stack.push(7);

        assertFalse(stack.isEmpty());
    }

    @Test
    void testPopEmptyThrows() {
        Stack<Integer> stack = new Stack<>();

        assertThrows(EmptyStackException.class, stack::pop);
    }

    @Test
    void testPeekEmptyThrows() {
        Stack<Integer> stack = new Stack<>();

        assertThrows(EmptyStackException.class, stack::peek);
    }
}

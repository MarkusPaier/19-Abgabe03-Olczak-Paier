package at.fhj.msd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringStackTest {
    public Stack s;

    @Before
    public void setup() throws Exception {
        s = new StringStack(5); // keep size of 5 !!
    }

    /**
     * tests if stack is empty after initialization
     * <p>
     * use assert
     * - assertTrue to check it's empty
     */
    @Test
    public void testIsEmpty() throws Exception {
        assertTrue(s.isEmpty());
    }

    /**
     * tests if stack is empty after pushing
     * <p>
     * use assert
     * - assertFalse to check it's not empty
     */
    @Test
    public void testIsNotEmpty() throws Exception {
        s.push("1");
        assertFalse(s.isEmpty());
    }

    /**
     * tests push and pop function
     * <p>
     * do following test
     * - use push, 1 or x times
     * - use pull, as often as you use push
     * - use isEmpty to check that's empty again
     * - assert every content of the stack in the correct ordering
     *
     * @throws Exception
     */
    @Test
    public void testPushPop() throws Exception {
        s.push("1");
        s.push("5");
        s.push("7");
        assertEquals("7", s.pop());
        assertEquals("5", s.pop());
        assertEquals("1", s.pop());
        assertTrue(s.isEmpty());
    }

    /**
     * Feel Free to insert other test cases for the String Stack Implementation !!!
     */

    // check size of stack
    @Test
    public void testSizeOfStack() throws Exception {
        try {
            s.push("1");
            s.push("2");
            s.push("3");
            s.push("4");
            s.push("5");
            s.push("6");
        } catch (java.lang.IllegalStateException e) {
            assertNull(e.getMessage());
        }
    }
    // check capacity of stack
    @Test //(expected = IllegalArgumentException.class)
    public void testCapacityOfStack() throws Exception {
        try {
            s = new StringStack(0);
        } catch (java.lang.IllegalArgumentException e) {
            assertEquals("size <= 0", e.getMessage());
        }
    }
}

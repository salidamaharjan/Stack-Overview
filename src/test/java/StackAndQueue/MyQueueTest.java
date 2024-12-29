package StackAndQueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    @Test
    void add() {
        MyQueue newQueue = new MyQueue();
        assertEquals(newQueue.toString(), "[]");
        newQueue.add("S");
        assertEquals(1, newQueue.size());
        newQueue.add("A");
        assertEquals(2, newQueue.size());
        newQueue.add("L");
        assertEquals(3, newQueue.size());
        newQueue.add("I");
        assertEquals(4, newQueue.size());
        newQueue.add("D");
        assertEquals(5, newQueue.size());
        newQueue.add("A");
        assertEquals(6, newQueue.size());
        assertEquals("S", newQueue.peek(0));
        assertEquals("A", newQueue.peek(1));
        assertEquals("L", newQueue.peek(2));
        assertEquals("I", newQueue.peek(3));
        assertEquals("D", newQueue.peek(4));
        assertEquals("A", newQueue.peek(5));
    }

    @Test
    void remove() {
        MyQueue newQueue = new MyQueue();
        assertEquals(newQueue.toString(), "[]");
        newQueue.add("S");
        newQueue.add("A");
        newQueue.add("L");
        newQueue.add("I");
        newQueue.add("D");
        newQueue.add("A");

        String remove = newQueue.remove();
        assertEquals("S", remove);
        assertEquals(5, newQueue.size());
        remove = newQueue.remove();
        assertEquals(4, newQueue.size());
        assertEquals("A", remove);
        remove = newQueue.remove();
        assertEquals("L", remove);
        assertEquals(3, newQueue.size());
        remove = newQueue.remove();
        assertEquals("I", remove);
        assertEquals(2, newQueue.size());
        remove = newQueue.remove();
        assertEquals("D", remove);
        assertEquals(1, newQueue.size());
        remove = newQueue.remove();
        assertEquals("A", remove);
        assertEquals(0, newQueue.size());
        assertNull(newQueue.remove());
    }

    @Test
    void peek() {
        MyQueue newQueue = new MyQueue();
        assertEquals(newQueue.toString(), "[]");
        newQueue.add("S");
        newQueue.add("A");
        assertEquals("S", newQueue.peek(0));
        assertEquals("A", newQueue.peek(1));
    }

    @Test
    void testToString() {
        MyQueue newQueue = new MyQueue();
        assertEquals(newQueue.toString(), "[]");
        newQueue.add("S");
        newQueue.add("A");
        newQueue.add("L");
        newQueue.add("I");
        newQueue.add("D");
        newQueue.add("A");
        assertEquals("[S,A,L,I,D,A,]", newQueue.toString());
        newQueue.remove();
        assertEquals("[A,L,I,D,A,]", newQueue.toString());
    }
}
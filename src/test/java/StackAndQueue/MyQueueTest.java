package StackAndQueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    @Test
    void add() {
        MyQueue newQueue = new MyQueue();
        assertEquals(newQueue.toString(), "[]");
        newQueue.add("S");
        newQueue.add("A");
        assertEquals(newQueue.peek(0), "S");
        assertEquals(newQueue.peek(1), "A");
    }

    @Test
    void remove() {
        MyQueue newQueue = new MyQueue();
        assertEquals(newQueue.toString(), "[]");
        newQueue.add("S");
        newQueue.add("A");
        assertEquals(newQueue.peek(0), newQueue.remove());
        assertEquals(newQueue.peek(0), newQueue.remove());
        assertNull(newQueue.remove());
    }

    @Test
    void peek() {
        MyQueue newQueue = new MyQueue();
        assertEquals(newQueue.toString(), "[]");
        newQueue.add("S");
        newQueue.add("A");
        assertEquals(newQueue.peek(0), "S");
        assertEquals(newQueue.peek(1), "A");
    }

    @Test
    void testToString() {
    }
}
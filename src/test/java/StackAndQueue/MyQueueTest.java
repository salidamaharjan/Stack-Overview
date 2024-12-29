package StackAndQueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    @Test
    void add() {
        MyQueue newQueue = new MyQueue();
        assertEquals(newQueue.toString(), "[]");
        newQueue.add("S");
    }

    @Test
    void remove() {
    }

    @Test
    void peek() {
    }

    @Test
    void testToString() {
    }
}
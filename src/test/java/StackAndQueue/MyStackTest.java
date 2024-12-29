package StackAndQueue;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    @Test
    void add() {
        MyStack newStack = new MyStack();
       assertEquals(newStack.toString(), "[]");
        newStack.add("S");
        assertNotNull(newStack);
        assertEquals(newStack.peek(0), "S");
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
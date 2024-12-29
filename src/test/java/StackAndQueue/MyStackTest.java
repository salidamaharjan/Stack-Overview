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
        assertEquals("S", newStack.peek(0));
        newStack.add("A");
        assertEquals("A", newStack.peek(1));
        newStack.add("L");
        assertEquals("L", newStack.peek(2));
        newStack.add("I");
        assertEquals("I", newStack.peek(3));
        newStack.add("D");
        assertEquals("D", newStack.peek(4));
        newStack.add("A");
        assertEquals("A", newStack.peek(5));
        assertNotNull(newStack);
    }

    @Test
    void remove() {
        MyStack newStack = new MyStack();
        assertEquals(newStack.toString(), "[]");
        newStack.add("S");
        newStack.add("A");
        newStack.add("T");
        newStack.add("M");
        assertEquals(newStack.peek(3), newStack.remove());
        assertEquals(newStack.peek(2), newStack.remove());
    }

    @Test
    void peek() {
        MyStack newStack = new MyStack();
        assertEquals(newStack.toString(), "[]");
        newStack.add("S");
        newStack.add("A");
        newStack.add("T");
        newStack.add("M");
        assertEquals(newStack.peek(1), "A");
        assertEquals(newStack.peek(0), "S");
    }

    @Test
    void testToString() {
        MyStack newStack = new MyStack();
        assertEquals(newStack.toString(), "[]");
        newStack.add("S");
        newStack.add("A");
        assertEquals(newStack.toString(),"[S,A,]");
    }
}
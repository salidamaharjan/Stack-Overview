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
        assertEquals(1, newStack.size());
        newStack.add("A");
        assertEquals("A", newStack.peek(1));
        assertEquals(2, newStack.size());
        newStack.add("L");
        assertEquals("L", newStack.peek(2));
        assertEquals(3, newStack.size());
        newStack.add("I");
        assertEquals("I", newStack.peek(3));
        assertEquals(4, newStack.size());
        newStack.add("D");
        assertEquals("D", newStack.peek(4));
        assertEquals(5, newStack.size());
        newStack.add("A");
        assertEquals("A", newStack.peek(5));
        assertEquals(6, newStack.size());
        assertNotNull(newStack);
    }

    @Test
    void remove() {
        MyStack newStack = new MyStack();
        assertEquals(newStack.toString(), "[]");
        newStack.add("S");
        newStack.add("A");
        newStack.add("L");
        newStack.add("I");
        newStack.add("D");
        newStack.add("A");
        String remove = newStack.remove();
        assertEquals("A", remove);
        assertEquals(5, newStack.size());
        remove = newStack.remove();
        assertEquals("D", remove);
        assertEquals(4, newStack.size());
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
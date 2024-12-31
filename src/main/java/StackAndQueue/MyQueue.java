package StackAndQueue;

public class MyQueue<T> implements MyList<T>{
    private Node<T> head;
    private Integer length;

    public MyQueue() {
        head = null;
        length = 0;
    }

    public Integer size() {
        return this.length;
    }

    @Override
    public void add(T s) {
        Node<T> newNode = new Node();
        newNode.setValue(s);
        length++;
        if (head == null) {
            head = newNode;
            return;
        }
        Node<T> lastNode = head;
        while (lastNode.getNext() != null) {
            lastNode = lastNode.getNext();
        }
        lastNode.setNext(newNode);

    }

    @Override
    public T remove() {
        if (head == null) {
            return null;
        }
        Node<T> curHead = head;
        head = head.getNext();
        length--;
        return curHead.getValue();
    }

    @Override
    public T peek(int index) {
        if (index >= length) {
            throw new IllegalArgumentException("Index greater than length");
        }
        if (head == null) {
            return null;
        }
        if (index == 0) {
            return head.getValue();
        }
        Node<T> curNode = head;
        for (int i = 0; i < index; i++) {
            curNode = curNode.getNext();
        }
        return curNode.getValue();
    }

    public String toString() {
        String out = "[";
        for (int i = 0; i < length; i++) {
            out += peek(i) + ",";
        }
        out += "]";
        return out;
    }
}



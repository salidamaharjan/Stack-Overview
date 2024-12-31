package StackAndQueue;

public class MyStack<T> implements MyList<T> {
    private Node<T> head;
    private Integer length;

    public MyStack() {
        head = null;
        length = 0;
    }

    public Integer size() {
        return length;
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
        Node<T> curHead = head;
        while (curHead.getNext() != null) {
            curHead = curHead.getNext();
        }
        curHead.setNext(newNode);
    }

    @Override
    public T remove() {
        Node<T> curNode = head;
        Node<T> prevNode = head;
        if (length == 1) {
            head = null;
            length--;
            return prevNode.getValue();
        }
        while (curNode.getNext() != null) {
            prevNode = curNode;
            curNode = curNode.getNext();
        }
        prevNode.setNext(null);
        length--;
        return curNode.getValue();
    }

    @Override
    public T peek(int index) {
        if (index >= length) {
            throw new IllegalArgumentException("Index is greater than length");
        }
        if (index < 0) {
            return null;
        }
        if (index == 0) {
            return head.getValue();
        }
        Node<T> curHead = head;

        for (int i = 0; i < index; i++) {
            curHead = curHead.getNext();
        }

        return curHead.getValue();
    }

    public String toString() {
        String outputInString = "[";
        for (int i = 0; i < length; i++) {
            outputInString += peek(i) + ",";
        }
        outputInString += "]";
        return outputInString;
    }
}



package StackAndQueue;

public class MyStack implements MyList {
    private Node head;
    private Integer length;

    public MyStack() {
        head = null;
        length = 0;
    }

    public Integer size(){
        return length;
    }
    @Override
    public void add(String s) {
        Node newNode = new Node();
        newNode.setValue(s);
        length++;
        if (head == null) {
            head = newNode;
            return;
        }
        Node curHead = head;
        while (curHead.getNext() != null) {
            curHead = curHead.getNext();
        }
        curHead.setNext(newNode);
    }

    @Override
    public String remove() {
        Node curNode = head;
        Node prevNode = head;
        if (length == 1) {
            head = null;
            length--;
            return prevNode.getValue();
        }
        while(curNode.getNext() != null){
            prevNode = curNode;
            curNode = curNode.getNext();
        }
        prevNode.setNext(null);
        length--;
       return curNode.getValue();
    }

    @Override
    public String peek(int index) {
        if (index >= length) {
            return "Index out of bound";
        }
        if(index < 0 ){
            return null;
        }
        if (index == 0) {
            return head.getValue();
        }
        Node curHead = head;

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



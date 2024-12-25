package StackAndQueue;

public class MyStack implements MyList {
    private Node head;
    private Integer length;

    public MyStack() {
        head = null;
        length = 0;
    }

    @Override
    public void add(String s) {
        Node newNode = new Node();
        newNode.setValue(s);
        length++;
        if(head == null){
            head = newNode;
            return;
        }
        Node curHead = head;
       while(head.getNext() != null){
           head = head.getNext();
       }
       curHead.setNext(newNode);
    }

    @Override
    public String remove() {
        Node prevNode;
        Node lastNode = head;
        if(head == null) {
            return null;
        }
        length --;
        for(int i = 0; i < length; i++){
            prevNode = head;
            lastNode = prevNode.getNext();
        }
        if(lastNode.getNext() == null) {
            return lastNode.getValue();
        }
        return null;
    }

    @Override
    public String peek(int index) {
        if(index >= length) {
            return "Index out of bound";
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

    public String toString(){
        String outputInString = "[";
        for(int i = 0 ; i < length; i++){
            outputInString += peek(i) + ",";
        }
        outputInString += "]";
        return outputInString;
    }
}



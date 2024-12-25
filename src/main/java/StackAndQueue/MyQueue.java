package StackAndQueue;

public class MyQueue implements MyList {
    private Node head;
    private Integer length;

    public MyQueue() {
        head = null;
        length = 0;
    }

    @Override
    public void add(String s) {
        Node newNode = new Node();
        newNode.setValue(s);
        length++;
        if( head == null){
            head = newNode;
            return;
        }
        Node lastNode = head;
        while(head.getNext() != null){
            head = head.getNext();
        }
        lastNode.setNext(newNode);

    }

    @Override
    public String remove() {
        return "";
    }

    @Override
    public String peek(int index) {
        if(index >= length){
            return "Index out of bound";
        }
        if(head == null) {
            return null;
        }
        if(index == 0) {
            return head.getValue();
        }
        Node curNode = head;
        for(int i = 0; i < index; i++) {
           curNode = curNode.getNext();
        }
        return curNode.getValue();
    }

    public String toString(){
        String out = "[";
        for (int i = 0; i < length; i++){
            out += peek(i) + ",";
        }
       out += "]";
        return  out;
    }
}



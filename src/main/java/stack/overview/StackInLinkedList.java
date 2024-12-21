package stack.overview;


public class StackInLinkedList {

    public void push(int num) {
    }

    public int pop() {
        return -1;
    }

    public void length() {

    }

    public void viewElement() {

    }

    public static void main(String[] args) {
    }
}

class Node {
    private Node next;
    private String value;
    public Node getNext(){
        return next;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public String getValue(){
        return this.value;
    }
    public void setValue(String value) {
        this.value = value;
    }
}


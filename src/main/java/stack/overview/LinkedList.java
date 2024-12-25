package stack.overview;

public class LinkedList {
    private Node head;
    private Integer length;

    public LinkedList() {
        head = null;
        length = 0;
    }

    public void add(String name) {
        Node newNode = new Node();
        newNode.setValue(name);

        length++;

        // list was empty, so head doens't hold anything
        if (head == null) {
            head = newNode;
            return;
        }
        // list is not empty, so we need to find the last item
        Node lastNode = head; // assume head is the last item to begin with
        while (lastNode.getNext() != null) { // traverse next node until we find a node that doesn't have next i.e. next == null
            lastNode = lastNode.getNext(); // update lastNode because our old assumption was incorrect
        }
        // we found the last node
        // so we use setNext to set our newly created node at the end
        lastNode.setNext(newNode);
    }

    public void remove(Integer index) {
        if (index >= length) {
            System.out.println("Node out of bound!");
            return;
        }
        Node curNode = head;
        Node prevNode = null;
        length--;
        for (int i = 0; i < index; i++) {
            prevNode = curNode;
            curNode = curNode.getNext();
        }
        if (prevNode == null) {
            head = curNode.getNext();
        } else {
            prevNode.setNext(curNode.getNext());
        }
    }

    public String get(Integer index) {

        if (index >= length) {
            return "Not found!";
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
        String out = "[";
        for (int i = 0; i < length; i++) {
            out += (get(i) + ", ");
        }
        out += "]";
        return out;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("0");
        ll.add("1");
        ll.add("2");
        ll.add("3");
        ll.add("4");
        System.out.println(ll);
        ll.remove(1);
        System.out.println(ll);
    }
}

class Node {
    private Node next;
    private String value;

    public Node() {
        next = null;
        value = "";
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}


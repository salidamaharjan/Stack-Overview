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

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("0");
        ll.add("1");
        ll.add("2");
        ll.add("3");
        ll.add("4");

//        System.out.println("Size == " + ll.length);
        System.out.println("Item at 0 index: " + ll.get(0));
        System.out.println("Item at 1 index: " + ll.get(1));
        System.out.println("Item at 2 index: " + ll.get(2));
        System.out.println("Item at 3 index: " + ll.get(3));
        System.out.println("Item at 4 index: " + ll.get(4));
        System.out.println("Item at 9 index: " + ll.get(9));
        System.out.println("Item at 1 index: " + ll.get(1));
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


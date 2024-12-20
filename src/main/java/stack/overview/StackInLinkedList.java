package stack.overview;

import java.util.LinkedList;

public class StackInLinkedList {
    LinkedList<Integer> linkedListOfNum = new LinkedList<>();
    int index = -1;

    public void push(Integer num){
        index++;
        linkedListOfNum.add(num);
    }

    public int pop() {
        int removedNum = linkedListOfNum.get(index);
        linkedListOfNum.remove(index);
        index--;
        return removedNum;
    }

    public void viewElement() {
        System.out.println("LinkList element: " + linkedListOfNum);
    }

    public static void main(String[] args) {
        StackInLinkedList listOfNum = new StackInLinkedList();
        listOfNum.push(13);
        listOfNum.viewElement();
        listOfNum.push(18);
        listOfNum.viewElement();
        System.out.println("Removed Number is: " + listOfNum.pop());
    }
}

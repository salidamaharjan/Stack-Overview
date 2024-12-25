package StackAndQueue;

public class Main {
    public static void main(String[] args) {
        MyStack newStack = new MyStack();
        newStack.add("String1");
        newStack.add("String2");
        System.out.println(newStack);
        System.out.println("Removed string: " + newStack.remove());
        System.out.println(newStack);
        MyQueue newQueue = new MyQueue();
        newQueue.add("Queue1");
        newQueue.add("Queue2");
        System.out.println(newQueue);
    }
}

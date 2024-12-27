package StackAndQueue;

public class Main {
    public static void main(String[] args) {
        MyStack newStack = new MyStack();
        System.out.println(newStack);
        newStack.add("String1");
        newStack.add("String2");
        newStack.add("String3");
        newStack.add("String4");
        System.out.println(newStack);
        System.out.println("Removed string: " + newStack.remove());
        System.out.println(newStack);

        System.out.println("Removed string: " + newStack.remove());
        System.out.println("Removed string: " + newStack.remove());
        System.out.println("Removed string: " + newStack.remove());
        System.out.println(newStack);
        newStack.add("String5");
        System.out.println(newStack);
        newStack.add("String6");
        System.out.println(newStack);

        MyQueue newQueue = new MyQueue();
        System.out.println(newQueue);
        newQueue.add("Queue1");
        newQueue.add("Queue2");
        System.out.println(newQueue);
        System.out.println("Removed queue: " + newQueue.remove());
        System.out.println(newQueue);
        System.out.println("Removed queue: " + newQueue.remove());
        System.out.println(newQueue);
        newQueue.add("Queue3");
        System.out.println(newQueue);
    }
}

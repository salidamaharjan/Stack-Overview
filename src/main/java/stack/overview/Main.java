package stack.overview;

import java.util.Arrays;

//push pop length;
public class Main {
    int maxStore = 5;
    String[] languages = new String[maxStore];
    int top = -1;

    public void push(String languageToAdd) {
        if (top > maxStore) {
            System.out.println("Cannot add. Reached max limit!");
        } else {
            top++;
            languages[top] = languageToAdd;
        }
    }

    public String pop() {
        String eliminated = "";
        if (top < 0) {
            System.out.println("Cannot remove. Element not found");
        } else {
            eliminated = languages[top];
            languages[top] = null;
            top--;
        }
        return eliminated;
    }

    public void peek() {
        System.out.println("The language on last index is: " + languages[top]);
    }

    public void length() {
        int lengthCount = 0;
        for (int i = 0; i < maxStore; i++) {
            if(languages[i] != null) {
                lengthCount++;
            }
        }
        System.out.println("The length of Stack: " + lengthCount);
    }

    public void viewArrayElement() {
        System.out.println("Language Array: " + Arrays.toString(languages));
    }

    public static void main(String[] args) {
        Main stack = new Main();
        stack.push("Java");
        stack.push("JavaScript");
        stack.viewArrayElement();
        stack.length();
        stack.peek();
        System.out.println("The language eliminated: " + stack.pop());
        stack.viewArrayElement();
        stack.peek();
        stack.length();
        System.out.println("The language eliminated: " + stack.pop());
        stack.viewArrayElement();
    }
}
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
    public void pop(){
        if(top < 0) {
            System.out.println("Cannot remove. Element not found");
        } else {
            languages[top] = null;
            top--;
        }
    }

    public void peek() {
        System.out.println("The language on last index is: " + languages[top]);
    }

    public int length(){
        return maxStore;
    }
    public void viewArrayElement(){
        System.out.println("Language Array: " + Arrays.toString(languages));
    }
    public static void main(String[] args) {
        Main stack = new Main();
        stack.push("Java");
        stack.push("JavaScript");
        stack.peek();
        stack.viewArrayElement();
        stack.pop();
        stack.viewArrayElement();
        stack.peek();
        int lengthOfStack = stack.length();
        System.out.println("The length of Stack: " + lengthOfStack);
        stack.pop();
        stack.viewArrayElement();
    }
}
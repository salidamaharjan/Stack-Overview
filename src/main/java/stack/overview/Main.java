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
    

    public static void main(String[] args) {
        Main stack = new Main();
        stack.push("Java");
        stack.push("JavaScript");

        System.out.println("Language Array: " + Arrays.toString(stack.languages));

    }
}
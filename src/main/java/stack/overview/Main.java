package stack.overview;

public class Main {
        int maxStore;
        String[] languages;

    public Main () {
        maxStore = 5;
        languages =  new String[maxStore];
    }

    public void push(String languageToAdd) {
        
    }

    public static void main(String[] args) {
        Main stack = new Main();
        stack.push("Java");

    }
}
package stack.overview;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        StackOverview languagesLearned = new StackOverview();
        languagesLearned.setLanguages("JavaScript");
        languagesLearned.setLanguages("TypeScript");
        languagesLearned.setLanguages("Java");
        System.out.println("Languages Learned: " + languagesLearned.getLanguages());
        languagesLearned.removeLanguage();
        System.out.println("Languages Learned: " + languagesLearned.getLanguages());
    }
}
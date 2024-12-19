package stack.overview;

import java.util.LinkedList;

public class StackOverview {
    private final LinkedList<String> languages;

    public StackOverview() {
        languages = new LinkedList<>();
    }

    public LinkedList<String> getLanguages() {
        return this.languages;
    }

    public void setLanguages(String language) {
        this.languages.push(language);
    }

}

package Flyweight;

public class FrenchBook implements Book {

    private String language= null;

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public void modify(String content) {
        System.out.println("Select the language of the book in:" + language);
    }
}

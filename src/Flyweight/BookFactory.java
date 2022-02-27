package Flyweight;

import java.util.HashMap;

public class BookFactory {
    private static final HashMap<String, Book> bookMap = new HashMap<>();

    public static Book getRomanianBook(String language)
    {
        String key = language+ "-ROU";
        Book book = bookMap.get(key);

        if(book != null) {
            return book;
        } else {
            book = new RomanianBook();
            book.setLanguage(language);
            bookMap.put(key, book);
        }

        return book;
    }

    public static Book getEnglishBook(String language)
    {
        String key = language + "-ENG";
        Book book = bookMap.get(key);

        if(book != null) {
            return book;
        } else {
            book = new EnglishBook();
            book.setLanguage(language);
            bookMap.put(key, book);
        }

        return book;
    }

    public static Book getFrenchBook(String language)
    {
        String key = language + "-FRA";
        Book book = bookMap.get(key);

        if(book  != null) {
            return book ;
        } else {
            book = new FrenchBook();
            book .setLanguage(language);
            bookMap.put(key, book );
        }
        return book ;
    }
}
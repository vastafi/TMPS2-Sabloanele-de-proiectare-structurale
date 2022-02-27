package Flyweight;

public class TestFlyweight {
    public static void main(String[] args)
    {
        Book lang = BookFactory.getEnglishBook("ENG");
        lang.modify("EnglishBook!");
        System.out.println(lang.hashCode());

        Book lang1 = BookFactory.getRomanianBook("ROU");
        lang1.modify("RomanianBook!");
        System.out.println(lang1.hashCode());

        Book lang2 = BookFactory.getEnglishBook("ENG");
        lang2.modify("EnglishBook!");
        System.out.println(lang2.hashCode());

        Book lang3 = BookFactory.getFrenchBook("FRA");
        lang3 .modify("FrenchBook!");
        System.out.println(lang3.hashCode());
    }
}

package Composite;

public class LitUniversal implements Books
    {
        private long id;
        private String title;
        private String author;
        private String language;
        private String publication;
        private String description;

        public static final String EOL_STRING =
                System.getProperty("line.separator");
        public static final String SPACE = " ";

    public LitUniversal (long id, String title, String author,String language, String publication, String description)
        {
            this.id = id;
            this.title = title;
            this.author= author;
            this.language = language;
            this.publication= publication;
            this.description= description;
        }

        @Override
        public void showBooksDetails()
        {
            System.out.println(id+" " + SPACE + EOL_STRING + title + SPACE + EOL_STRING + author + SPACE + EOL_STRING + language + SPACE + EOL_STRING + publication + SPACE + EOL_STRING + description + SPACE + EOL_STRING );
        }

    }

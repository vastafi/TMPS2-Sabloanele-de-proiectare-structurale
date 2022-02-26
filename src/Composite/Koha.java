package Composite;
import java.util.ArrayList;
import java.util.List;
public class Koha implements Books
    {
        private List<Books> booksList = new ArrayList<Books>();

        @Override
        public void showBooksDetails()
        {
            for(Books book:booksList)
            {
                book.showBooksDetails();
            }
        }

        public void addBook(Books book)
        {
            booksList.add(book);
        }

        public void removeBook(Books book)
        {
            booksList.remove(book);
        }
    }


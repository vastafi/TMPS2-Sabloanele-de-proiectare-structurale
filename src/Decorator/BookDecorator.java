package Decorator;

public abstract class BookDecorator implements Library {
    private Library newBook;
    public BookDecorator(Library newBook)  {
        this.newBook = newBook;
    }
    @Override
    public String buyBook(){
        return newBook.buyBook();
    }
    public double bookPrice(){
        return newBook.bookPrice();
    }
}
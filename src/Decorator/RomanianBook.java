package Decorator;

public class RomanianBook extends BookDecorator{
    public RomanianBook(Library newBook) {
        super(newBook);
    }
    public String buyBook(){
        return super.buyBook() +" with poems and short stories ";
    }
    public double bookPrice()   {
        return super.bookPrice()+120.0;
    }
}

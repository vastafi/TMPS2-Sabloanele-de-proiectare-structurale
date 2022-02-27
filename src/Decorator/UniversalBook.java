package Decorator;

public class UniversalBook extends BookDecorator{
    public UniversalBook (Library newBook) {
        super(newBook);
    }
    public String buyBook(){
        return super.buyBook() +" with love stories ";
    }
    public double bookPrice()   {
        return super.bookPrice()+240.0;
    }
}


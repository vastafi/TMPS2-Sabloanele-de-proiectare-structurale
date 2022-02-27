package Bridge;

public class Physically extends Books{
    public Physically(BorrowBooks borrowBook){
        super(borrowBook);
    }
    @Override
    public void borrow(){
        borrowBook.borrowBooks();
    }
}
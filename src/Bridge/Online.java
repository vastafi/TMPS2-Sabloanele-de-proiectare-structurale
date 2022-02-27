package Bridge;

public class Online extends Books{
    public Online(BorrowBooks borrowBook){
        super(borrowBook);
    }
    @Override
    public void borrow(){
        borrowBook.borrowBooks();
    }
}
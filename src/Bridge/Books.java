package Bridge;

public abstract class Books {
    BorrowBooks borrowBook;
        public Books(BorrowBooks borrowBook){
            this.borrowBook=borrowBook;
        }
        abstract public void borrow();
}


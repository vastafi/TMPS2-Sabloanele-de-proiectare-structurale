package Bridge;

public class BorrowOnline  implements BorrowBooks {
    @Override
    public void borrowBooks(){
        System.out.println("BorrowOnline: The book is ready to be borrowed online...");
    }
}
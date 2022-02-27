package Bridge;

public class BorrowPhysically implements BorrowBooks {
    @Override
    public void borrowBooks(){
        System.out.println("BorrowPhysically: The book is ready to be borrowed in physical format...");
    }
}
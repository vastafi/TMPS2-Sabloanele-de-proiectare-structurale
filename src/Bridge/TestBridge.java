package Bridge;

import org.junit.Test;

public class TestBridge {

    @Test
    public void testBorrow() {
        BorrowBooks onlineBorrow = new BorrowOnline();
        Books borrowOnline = new Online(onlineBorrow);
        borrowOnline.borrow();

        BorrowBooks physicallyBorrow = new BorrowPhysically();
        Books borrowPhysically = new Physically(physicallyBorrow);
        borrowPhysically.borrow();
    }
}

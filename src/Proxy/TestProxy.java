package Proxy;

public class TestProxy {
    public static void main(String[] args) {
        Proxy myProxy = new Proxy();
        myProxy.authenticate("Invalid", "Credentials");
        System.out.println("Current number of books : " + myProxy.getNumBooks(10));
        System.out.println();
        System.out.println("Updating number of books by 10 ");
        myProxy.updateNumBooks(10, 10);
        System.out.println();
        System.out.println("Current number of books: " + myProxy.getNumBooks(10));
        System.out.println();
        myProxy.authenticate("myUsername", "myPassword");
        System.out.println("Current number of books: " + myProxy.getNumBooks(100));
        System.out.println("Updating number of books by 10 ");
        myProxy.updateNumBooks(100, 10);
        System.out.println("New number of books : " + myProxy.getNumBooks(100));
        System.out.println();

    }
}

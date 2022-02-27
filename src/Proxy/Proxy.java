package Proxy;

public class Proxy implements KohaInterface {
    CirculationHistory circulationHistory;

    public void authenticate(String a, String b) {
        if (a == "myUsername" && b == "myPassword") {
            System.out.println("Successfully Authenticated!");
            circulationHistory= new CirculationHistory();
        }
    }

    public void updateNumBooks(int patronNum, int book) {
        if (circulationHistory == null) {
            System.out.println("You must be Authenticated to borrow books");
        } else {
            circulationHistory.updateNumBooks(patronNum, book);
        }
    }

    public double getNumBooks(int patronNum) {
        if (circulationHistory == null) {
            System.out.println("You must be Authenticated to get your the available books!");
            return 0;
        }
        return circulationHistory.getNumBooks(patronNum);
    }
}
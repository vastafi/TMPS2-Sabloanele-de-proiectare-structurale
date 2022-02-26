package Facade;

public class CheckInValidator {
    public int validate( int accountBooks, int nBooks)
    {
        if(accountBooks < nBooks) return 0;
        else if(accountBooks - nBooks < 20) return 1;
        return 2;
    }
}

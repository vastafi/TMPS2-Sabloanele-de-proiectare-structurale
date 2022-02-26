package Facade;

public class TestFacade {
    public static void main(String[]  args){
         {
            UserAccount userAccount = new UserAccount(8828);
            LibraryInterface library = new Library(userAccount);
            library.checkIn(2);
        }
    }
}


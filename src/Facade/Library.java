package Facade;

public class Library extends LibraryInterface {
    private UserAccount userAccount;

    public Library (UserAccount userAccount)
    {
        this.userAccount = userAccount;
    }

    @Override
    public void checkIn(int nOfBooks)
    {
        AccountValidator accountValidator = new AccountValidator();
        boolean isAccountExists = accountValidator.validate(userAccount.getAccountNumber());

        if(isAccountExists)
        {
            CheckInValidator checkInValidator = new CheckInValidator();
            int type = checkInValidator.validate( userAccount.getSavings(), nOfBooks);
            switch (type)
            {
                case 0:
                    System.out.println(String.format("Renew account for Check in", nOfBooks));
                    break;
                case 1:
                    System.out.println("Renew account for Check in 2 week");
                    break;
                case 2:
                    System.out.println("Check in with success!");
                    break;
                default:
                    break;
            }
        }
        else
        {
            System.out.println("Account is not exists!");
        }
    }
}

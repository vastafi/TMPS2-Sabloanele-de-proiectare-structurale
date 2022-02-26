package Facade;

public class UserAccount {

        private String accountNumber;
        private int savings;

        public UserAccount() {}

        public UserAccount(int savings)
        {
            this.accountNumber = "75828";
            this.savings = savings;
        }

        public String getAccountNumber()
        {
            return accountNumber;
        }

        public int getSavings()
        {
            return savings;
        }

}

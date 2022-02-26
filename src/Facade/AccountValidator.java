package Facade;


import java.util.Arrays;
import java.util.List;

public class AccountValidator
{
    private List<String> validAccounts = Arrays.asList("75828", "85828");

    public boolean validate(String accountNumber)
    {
        return validAccounts.contains(accountNumber);
    }
}
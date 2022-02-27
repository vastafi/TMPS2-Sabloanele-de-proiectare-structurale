package Adapter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class User extends LibraryDetails implements UserCard{
    public void giveLibraryDetails(){
        try{

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the account name :");
            String accountName = br.readLine();
            System.out.print("Enter the account number:");

            long libraryNumber=Long.parseLong(br.readLine());
            System.out.print("Enter the library name :");
            String libraryName=br.readLine();

            System.out.print("\n");

            setAccountName(accountName);
            setLibraryNumber(libraryNumber);
            setLibraryName(libraryName);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String getUserCard() {

        long number=getLibraryNumber();
        String account=getAccountName();
        String library=getLibraryName();

        return ("The Library Number "+ number +" of "+ account +" in "+ library + " library is valid and authenticated to borrow books at home.");
    }
}

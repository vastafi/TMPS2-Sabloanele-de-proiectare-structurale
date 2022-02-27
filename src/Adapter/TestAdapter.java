package Adapter;

public class TestAdapter {
    public static void main(String args[])
    {
       UserCard targetInterface=new User();
       targetInterface.giveLibraryDetails();
       System.out.print(targetInterface.getUserCard());
    }
}



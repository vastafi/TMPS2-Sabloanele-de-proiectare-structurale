package Decorator;

public class Books implements Library {
    public String buyBook(){
        return "Books";
    }

    public double bookPrice(){
        return 20.0;
    }
}
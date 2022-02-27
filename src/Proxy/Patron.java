package Proxy;

public class Patron {

    int patronNum;
    int book;
    String name;
    String address;
    String type;

    public Patron (int patronNum, int book, String name , String address, String type ) {
        this.patronNum = patronNum;
        this.book = book;
        this.name = name ;
        this.address = address;
        this.type = type ;
    }

    public int getPatronNum() {
        return patronNum;
    }

    public void setPatronNum(int patronNum) {
        this.patronNum = patronNum;
    }

    public int getBook() {
        return book;
    }

    public void setBook(int book) {
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


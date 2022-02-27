package Proxy;

import java.util.ArrayList;
import java.util.Iterator;

public class CirculationHistory  implements KohaInterface  {

    private ArrayList<Patron> accountArray = new ArrayList<Patron>();
    private int NumOfLibrary = 0;
    int accountID;

    public CirculationHistory() {
        accountArray.add(new Patron(100, 1, "Arina Cazac","str. Armenească nr. 67/1", "Intelectuali"));
        accountArray.add(new Patron(101, 10, "Laba Alexandra","şos. Munceşti ap. 812 ap. 43", "Muncitori"));
        accountArray.add(new Patron(102, 5, "Labuneţ Ecaterina","str.Grenoble, nr.130, ap.88", "Bibliotecari"));
        accountArray.add(new Patron(103, 4, "Lacatuş Anastasia","str. Mihai Viteazul nr. 46, ap. 16", "Intelectuali "));
        accountArray.add(new Patron(104, 100, "Cazac Romeo","str. Armenească nr. 64/1", "Intelectuali"));
        accountArray.add(new Patron(105, 10, "Cotoman Cristina","şos. Munceşti ap. 81 ap. 43", "Muncitori"));
        accountArray.add(new Patron(106, 15, "Fagurel Maria","str.Grenoble, nr.13, ap.8", "Bibliotecari"));
        accountArray.add(new Patron(107, 45, "Morari Olga","str. Mihai Viteazul nr. 46, ap. 4", "Intelectuali "));
        accountArray.add(new Patron(108, 10, "Cazac Ion","str. Armenească nr. 67/2", "Intelectuali"));
        accountArray.add(new Patron(109, 1, "Laba Vasile","şos. Munceşti ap. 812 ap. 53", "Muncitori"));
        accountArray.add(new Patron(110, 15, "Astafieva Ecaterina","str.Grenoble, nr.120, ap.8", "Bibliotecari"));
        accountArray.add(new Patron(111, 5, "Lăcătuș Marius","str. Mihai Viteazul nr. 36, ap. 45", "Intelectuali "));
        NumOfLibrary = 12;
    }

    public void createAccount(int patronNum, int book, String name , String address, String type ) {
        accountArray.add(new Patron(patronNum, book, name, address, type));
        NumOfLibrary ++;
    }

    public void deleteAccount(int getNumBooks) {
        Iterator<Patron> iterator = accountArray.iterator();

        while(iterator.hasNext()) {
            if(iterator.next().getPatronNum() == (getNumBooks)) {
                iterator.remove();
            }
        }
        accountID--;
    }

    public void updateNumBooks(int getNumBooks, int newBook) {
        Iterator<Patron> iterator = accountArray.iterator();

        while(iterator.hasNext()) {
            if(iterator.next().getPatronNum() == (getNumBooks)) {
                iterator.next().setBook(iterator.next().getBook() + newBook);
            }
        }
    }

    public double getNumBooks(int numBooks) {
        int num = 0;
        Iterator<Patron> iterator = accountArray.iterator();

        while(iterator.hasNext()) {
            if(iterator.next().getPatronNum() == (numBooks)) {
                num = iterator.next().getBook();
            }
        }
        return num;
    }
}
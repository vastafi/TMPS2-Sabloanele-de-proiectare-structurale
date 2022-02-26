package Composite;

public class TestComposite {
    public static void main (String[] args)
    {
            LitRomanian litRom1 = new LitRomanian(20077930,"Doamna Bovary","Gustave Flaubert","French","București : Litera, 2018","480 p.");
            LitRomanian litRom2 = new LitRomanian(20017345,"Şcoala de afaceri","Robert T. Kiyosaki, Sharon L. Lechter","Romanian","Bucureşti : Curtea Veche, 2018","188 p.");
            Koha romKoha = new Koha ();
            romKoha.addBook(litRom1);
            romKoha.addBook(litRom2);

            LitUniversal litUniv1 = new LitUniversal(20017345,"Prima dată ","Denise Stagnara","German","Chişinău : Cartier, 2009","108 p. : il.");
            LitUniversal litUniv2 = new LitUniversal(20017345,"Tainele sănătății","Vladimir Sainciuc","Romanian","P.P. Tainele Sănătății S.A., 2017-2020","8 p.");
            Koha univKoha = new Koha ();
            univKoha.addBook(litUniv1);
            univKoha.addBook(litUniv2);

            Koha directory = new Koha ();
            directory.addBook(romKoha);
            directory.addBook(univKoha);
            directory.showBooksDetails();
        }
    }


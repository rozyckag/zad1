package Zad4;

public class Ksiazka {
    String tytul;
    String autor;
    int iloscStron;
    int iloscPrzeczytanychStron;

    public Ksiazka(String nowyTytul, String nowyAutor, int strony){
        tytul = nowyTytul;
        autor = nowyAutor;
        iloscStron = strony;
        iloscPrzeczytanychStron = 0;
    }

    void coToZaKsiazka(){
        System.out.println("Informacje o ksiązce:");
        System.out.println("Autor: " + autor);
        System.out.println("Tytul: " + tytul);
        System.out.println("Ilosc stron: " + iloscStron);
        System.out.println("Ilosc przeczytanych stron: " + iloscPrzeczytanychStron);
    }

    void czytaj(int iloscStronDoPrzeczytania){

        if (!czyPrzeczytana()) {
            iloscPrzeczytanychStron += iloscStronDoPrzeczytania;
            if (iloscPrzeczytanychStron > iloscStron)
                iloscPrzeczytanychStron = iloscStron;
        }
        else
            System.out.println("Dana ksiązka zostala juz przeczytana.");
    }

    boolean czyPrzeczytana(){
        if (iloscPrzeczytanychStron == iloscStron)
            return true;
        else
            return false;
    }

}

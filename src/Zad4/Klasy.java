package Zad4;

public class Klasy {
    public static void main(String[] args) {

// ------------------ zad. 1

        Czlowiek nowy = new Czlowiek("Jas", "Fasola");
        nowy.przedstawSie();


// ------------------ zad. 2

        Ksiazka nowaKsiazka = new Ksiazka("Doktor Sen", "S. King", 420);
        nowaKsiazka.coToZaKsiazka();
        nowaKsiazka.czytaj(200);
        nowaKsiazka.coToZaKsiazka();

        if (nowaKsiazka.czyPrzeczytana())
            System.out.println("Ksiazka przeczytana");
        else
            System.out.println("Ksiazka nieprzeczytana");

        nowaKsiazka.czytaj(300);
        nowaKsiazka.coToZaKsiazka();
        nowaKsiazka.czytaj(10);
        nowaKsiazka.coToZaKsiazka();


// ------------------ zad. 3

        Samochod nowySamochod = new Samochod("Skoda Octavia", "Czarny", 5.5, 35);

        nowySamochod.coToZaAuto();
        nowySamochod.jedz(10);
        nowySamochod.tankuj(20);
        nowySamochod.ilePaliwa();
        nowySamochod.jedz(10);
        nowySamochod.ilePaliwa();
        nowySamochod.jakiPrzebieg();
        nowySamochod.jedz(200);
        nowySamochod.ilePaliwa();
        nowySamochod.jakiPrzebieg();

        Samochod uzywanySamochod = new Samochod("Ford Mondeo", "Niebieski", 120000, 20, 5.0, 40);

        uzywanySamochod.coToZaAuto();
        uzywanySamochod.jedz(100);
        uzywanySamochod.jakiPrzebieg();
        uzywanySamochod.ilePaliwa();
        uzywanySamochod.tankuj(25);
        uzywanySamochod.ilePaliwa();

    }
}

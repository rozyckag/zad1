package Zad4;

public class Czlowiek {
    String imie;
    String nazwisko;

    public Czlowiek(String noweImie, String noweNazwisko){
        imie = noweImie;
        nazwisko = noweNazwisko;
    }

    void przedstawSie(){
        System.out.println("Nazywam się " + imie + " " + nazwisko);
    }
}

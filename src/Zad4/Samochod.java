package Zad4;

public class Samochod {
    String marka;
    String kolor;
    double przebieg;
    double iloscPaliwa;
    double spalanie;
    double pojemnoscBaku;

    public Samochod(String nowaMarka, String nowyKolor, double iloscLitrowNa100KM, double pojemnoscBakuModelu){
        marka = nowaMarka;
        kolor = nowyKolor;
        przebieg = 0;
        iloscPaliwa = 0;
        spalanie = iloscLitrowNa100KM;
        pojemnoscBaku = pojemnoscBakuModelu;
    }

    public Samochod(String nowaMarka, String nowyKolor, double przejechaneKM, double stanPaliwa, double iloscLitrowNa100KM,
                    double pojemnoscBakuModelu){
        marka = nowaMarka;
        kolor = nowyKolor;
        przebieg = przejechaneKM;
        iloscPaliwa = stanPaliwa;
        spalanie = iloscLitrowNa100KM;
        pojemnoscBaku = pojemnoscBakuModelu;
    }

    void coToZaAuto(){
        System.out.println("Marka: " + marka);
        System.out.println("Kolor: " + kolor);
    }

    void ilePaliwa(){
        System.out.println("Ilośc paliwa w samochodzie: " + iloscPaliwa);
    }

    void jakiPrzebieg(){
        System.out.println("Ilosc przejechanych kilometrów: " + przebieg);
    }

    void jedz(double przejechaneKM){
        double ileSpali = przejechaneKM * spalanie / 100;

        if (ileSpali < iloscPaliwa){
            przebieg += przejechaneKM;
            iloscPaliwa -= ileSpali;
        }
        else
            System.out.println("Paliwo się skończyło! Dalej nie pojedziesz");
    }

    void tankuj(double iloscZatankowanychLitrow){
        iloscPaliwa += iloscZatankowanychLitrow;
        if (iloscPaliwa >= pojemnoscBaku){
            iloscPaliwa = pojemnoscBaku;
            System.out.println("Zatankowałeś do pełna");
        }

    }

}

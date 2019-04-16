public class dzialania {
    public static void main(String[] args) {
        int zmienna1 = 26;
        int zmienna2 = 5;

        int dodawanie = zmienna1 + zmienna2;
        int odejmowanie = zmienna1 - zmienna2;
        int mnozenie = zmienna1 * zmienna2;
        int dzielenie = zmienna1 / zmienna2;
        int modulo = zmienna1 % zmienna2;

        System.out.println("Wartość zmiennej1: " + zmienna1 + "\n" +
                "Wartość zmiennej2: " + zmienna2 + "\n" +
                "Wynik dodawania: " + dodawanie + "\n" +
                "Wynik odejmowania: " + odejmowanie + "\n" +
                "Wynik mnozenia: " + mnozenie + "\n" +
                "Wynik dzielenia: " + dzielenie + "\n" +
                "Wynik dzielenia modulo: " + modulo + "\n"
        );

    }
}

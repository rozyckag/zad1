public class najwiekszaLiczba {
    public static void main(String[] args) {
        int zmienna1 = 9;
        int zmienna2 = 15;
        int zmienna3 = -2;

        int liczbaNajwieksza = zmienna1;
        int liczbaNajmniejsza = zmienna1;

        if (zmienna2 > liczbaNajwieksza)
            liczbaNajwieksza = zmienna2;
        else
            liczbaNajmniejsza = zmienna2;

        if (zmienna3 > liczbaNajwieksza)
            liczbaNajwieksza = zmienna3;

        if (zmienna3 < liczbaNajmniejsza)
            liczbaNajmniejsza = zmienna3;

        System.out.println("Największa liczba: " + liczbaNajwieksza + "\n" +
                "Najmniejsza liczba: " + liczbaNajmniejsza
        );
    }
}

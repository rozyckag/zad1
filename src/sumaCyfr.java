public class sumaCyfr {
    public static void main(String[] args) {
        int liczbaCzterocyfrowa = 4567;

        int tysiace = liczbaCzterocyfrowa / 1000;
        int setki = (liczbaCzterocyfrowa  / 100) % 10;
        int dziesiatki = (liczbaCzterocyfrowa / 10) % 10;
        int jednosci = liczbaCzterocyfrowa % 10 ;

        int sumaCyfr = tysiace;
        sumaCyfr += setki + dziesiatki + jednosci;
        float sredniaCyfr = sumaCyfr / 4f;

        System.out.println("Cyfra tysiecy: " + tysiace + "\n" +
                "Cyfra setek: " + setki + "\n" +
                "Cyfra dziesiatek: " + dziesiatki + "\n" +
                "Cyfra jednosci: " + jednosci + "\n" +
                "Suma cyfr: " + sumaCyfr + "\n" +
                "Srednia cyfr: " + sredniaCyfr
        );

    }
}

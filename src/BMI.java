public class BMI {
    public static void main(String[] args) {
        float wagaKG = 45f;
        float wzrostM = 1.6f;
        double BMI = wagaKG / Math.pow(wzrostM, 2);
        String niedowaga = "Niedowaga";
        String nadwaga = "Nadwaga";
        String wagaPrawidlowa = "Waga prawidlowa";


        if (BMI < 18.5)
            System.out.println(niedowaga);
        else if (BMI > 24.9)
                System.out.println(nadwaga);
            else
                System.out.println(wagaPrawidlowa);

        System.out.println("BMI: " + BMI);

    }


}

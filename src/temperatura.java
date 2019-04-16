public class temperatura {
    public static void main(String[] args) {
        double stopnieC = 260;
        double stopnieF = 5;

        double stopnieFahrenheita =  1.8 * stopnieC + 32.0;
        double stopnieCelsjusza = (stopnieF - 32.0) / 1.8;

        System.out.println(stopnieC + " stopni Celsjusza to " + stopnieFahrenheita + " stopni Fahrenheita\n" +
                stopnieF + " stopni Fahrenheita to " + stopnieCelsjusza + " stopni Fahrenheita"
        );

    }
}

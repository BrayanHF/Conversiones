package app.conversiones.divisas;

public class KRW implements Divisa {

    private static final double cUSD = 0.00078;
    private static final double cMXN = 0.013;
    private static final double cEUR = 0.00071;
    private static final double cGBP = 0.0000061;
    private static final double cJPY = 0.11;
    private static KRW krw;

    private KRW() {
    }

    public static KRW getKRW() {
        if (krw == null) {
            krw = new KRW();
        }
        return krw;
    }

    @Override
    public double convertir(String to, double amount) {
        double conversion = 0;
        switch (to) {
            case "USD" -> conversion = amount * cUSD;
            case "MXN" -> conversion = amount * cMXN;
            case "EUR" -> conversion = amount * cEUR;
            case "GBP" -> conversion = amount * cGBP;
            case "JPY" -> conversion = amount * cJPY;
        }
        return conversion;
    }

}
package app.conversiones.divisas;

public class GBP implements Divisa {

    private static final double cEUR = 1.1581;
    private static final double cUSD = 1.285;
    private static final double cMXN = 21.694;
    private static final double cJPY = 181.2;
    private static final double cKRW = 1645.47;
    private static GBP gbp;

    private GBP() {
    }

    public static GBP getGBP() {
        if (gbp == null) {
            gbp = new GBP();
        }
        return gbp;
    }

    @Override
    public double convertir(String to, double amount) {
        double conversion = 0;
        switch (to) {
            case "USD":
                conversion = amount * cUSD;
                break;
            case "MXN":
                conversion = amount * cMXN;
                break;
            case "EUR":
                conversion = amount * cEUR;
                break;
            case "JPY":
                conversion = amount * cJPY;
                break;
            case "KRW":
                conversion = amount * cKRW;
                break;
        }
        return conversion;
    }

}
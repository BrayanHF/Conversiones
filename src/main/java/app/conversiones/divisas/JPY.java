package app.conversiones.divisas;

public class JPY implements Divisa {

    private static final double cUSD = 0.00709;
    private static final double cMXN = 0.11972;
    private static final double cEUR = 0.00639;
    private static final double cGBP = 0.00552;
    private static final double cKRW = 9.0807;
    private static JPY jpy;

    private JPY() {
    }

    public static JPY getJPY() {
        if (jpy == null) {
            jpy = new JPY();
        }
        return jpy;
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
            case "GBP":
                conversion = amount * cGBP;
                break;
            case "KRW":
                conversion = amount * cKRW;
                break;
        }
        return conversion;
    }

}
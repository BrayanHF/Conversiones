package app.conversiones.divisas;

public class USD implements Divisa {

    private static final double cMXN = 16.8828;
    private static final double cEUR = 0.90123;
    private static final double cGBP = 0.77821;
    private static final double cJPY = 141.01;
    private static final double cKRW = 1280.52;
    private static USD usd;

    private USD() {
    }

    public static USD getUSD() {
        if (usd == null) {
            usd = new USD();
        }
        return usd;
    }

    @Override
    public double convertir(String to, double amount) {
        double conversion = 0;
        switch (to) {
            case "KRW" -> conversion = amount * cKRW;
            case "MXN" -> conversion = amount * cMXN;
            case "EUR" -> conversion = amount * cEUR;
            case "GBP" -> conversion = amount * cGBP;
            case "JPY" -> conversion = amount * cJPY;
        }
        return conversion;
    }

}
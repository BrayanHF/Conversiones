package app.conversiones.divisas;

public class EUR implements Divisa {

    private static final double cUSD = 1.1096;
    private static final double cMXN = 18.7332;
    private static final double cGBP = 0.8635;
    private static final double cJPY = 156.47;
    private static final double cKRW = 1420.86;
    private static EUR eur;

    private EUR() {
    }

    public static EUR getEUR() {
        if (eur == null) {
            eur = new EUR();
        }
        return eur;
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
            case "GBP":
                conversion = amount * cGBP;
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
package app.conversiones.divisas;

public class MXN implements Divisa {

    private static final double cUSD = 0.059;
    private static final double cEUR = 0.054;
    private static final double cGBP = 0.046;
    private static final double cJPY = 8.41;
    private static final double cKRW = 76.06;
    private static MXN mxn;

    private MXN() {
    }

    public static MXN getMXN() {
        if (mxn == null) {
            mxn = new MXN();
        }
        return mxn;
    }

    @Override
    public double convertir(String to, double amount) {
        double conversion = 0;
        switch (to) {
            case "USD":
                conversion = amount * cUSD;
                break;
            case "EUR":
                conversion = amount * cEUR;
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
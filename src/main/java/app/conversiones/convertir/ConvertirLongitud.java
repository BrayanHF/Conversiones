package app.conversiones.convertir;

public class ConvertirLongitud {

    public static double[] convertir(String from, double amount) {
        double[] longitudes = new double[4];
        switch (from) {
            case "mm":
                longitudes[1] = amount / 10;
                longitudes[2] = amount / 1000;
                longitudes[3] = amount / 1000000;
                break;
            case "cm":
                longitudes[0] = amount * 10;
                longitudes[2] = amount / 100;
                longitudes[3] = amount / 100000;
                break;
            case "m":
                longitudes[0] = amount * 1000;
                longitudes[1] = amount * 100;
                longitudes[3] = amount / 1000;
                break;
            case "km":
                longitudes[0] = amount * 1000000;
                longitudes[1] = amount * 100000;
                longitudes[2] = amount * 1000;
                break;
        }
        return longitudes;
    }
}

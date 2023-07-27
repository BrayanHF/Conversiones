package app.conversiones.convertir;

import org.json.JSONObject;
import app.conversiones.divisas.EUR;
import app.conversiones.divisas.GBP;
import app.conversiones.divisas.JPY;
import app.conversiones.divisas.KRW;
import app.conversiones.divisas.MXN;
import app.conversiones.divisas.USD;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConvertirDivisas {

    public static double convertir(double amount, String from, String to) {
        double conversion = 0;
        String url = "https://api.frankfurter.app/latest?amount=" + amount + "&from=" + from + "&to=" + to;
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url))
                .build();
        try {
            HttpResponse<String> respuesta = HttpClient.newHttpClient().send(request,
                    HttpResponse.BodyHandlers.ofString());
            if (respuesta.statusCode() == 200) {
                JSONObject respuestaJSON = new JSONObject(respuesta.body());
                conversion = respuestaJSON.getJSONObject("rates").getDouble(to);
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            switch (from) {
                case "KRW" -> conversion = KRW.getKRW().convertir(to, amount);
                case "MXN" -> conversion = MXN.getMXN().convertir(to, amount);
                case "EUR" -> conversion = EUR.getEUR().convertir(to, amount);
                case "GBP" -> conversion = GBP.getGBP().convertir(to, amount);
                case "JPY" -> conversion = JPY.getJPY().convertir(to, amount);
                case "USD" -> conversion = USD.getUSD().convertir(to, amount);
            }
        }
        return conversion;
    }

}
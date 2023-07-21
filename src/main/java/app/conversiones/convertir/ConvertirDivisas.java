package app.conversiones.convertir;

import org.json.JSONObject;
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
            conversion = -1;
        }
        return conversion;
    }

}
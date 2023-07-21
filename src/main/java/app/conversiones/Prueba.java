package app.conversiones;

import app.conversiones.convertir.ConvertirDivisas;

public class Prueba {

    public static void main(String[] args) {
        double conversion = ConvertirDivisas.convertir(10, "USD", "GBP");
        System.out.println(conversion);
    }
}

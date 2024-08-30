package Bloque1.JulioIngrid;

public class Main {

    public static void main(String[] args) {

        ProcesadorDePagos procesador = new ProcesadorDePagos();

        Pago pagoConTarjeta = new TarjetaCredito("1324-5678-9012-1234", "12/25", "684");
        Pago pagoConPaypal = new PayPal("emilio@uv.mx");

        procesador.procesar(pagoConTarjeta);
        procesador.procesar(pagoConPaypal);

    }
}

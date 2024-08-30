package Bloque1.JulioIngrid;

public class ProcesadorDePagos {

    public void procesar(Pago pago) {
        pago.procesarPago();

        // downcasting
        if (pago instanceof TarjetaCredito) {
            TarjetaCredito tarjeta = (TarjetaCredito) pago;
            tarjeta.verificarLimiteCredito();
        } else if (pago instanceof PayPal) {
            PayPal payPal = (PayPal) pago;
            payPal.enviarRecibo();
        }
    }
}
